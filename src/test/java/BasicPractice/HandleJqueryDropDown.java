package BasicPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJqueryDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// handle jquery dropdown
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("justAnInputBox")).click();
		
	//	selectByChoice(driver,"choice 1","choice 2 3","choice 6 2 2");
		selectByChoice(driver,"all");
		
	}
	
	public static void selectByChoice(WebDriver driver, String... value) {
		//div[@id="comboTree405132DropDownContainer"]//ul//input[@type="checkbox"]
		//List<WebElement>choicelist=driver.findElements(By.xpath("//div[@id=\"comboTree405132DropDownContainer\"]//ul//input[@type=\"checkbox\"]"));
		List<WebElement>choicelist=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

			if(!value[0].equalsIgnoreCase("all")) 
			{
				for(WebElement item:choicelist)
				{
				String text= item.getText();
				
				for(String val:value) {
					if(text.equals(val)) {
						item.click();
						break;
					}
				}
				}
			}
			else {
				try {
					for(WebElement item:choicelist)
					{
						item.click();
					}
				}catch(Exception e)
				{
					
				}
				
			}
		}
	


}
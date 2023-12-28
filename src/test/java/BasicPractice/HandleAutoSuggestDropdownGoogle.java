package BasicPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAutoSuggestDropdownGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("APjFqb")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> options=driver.findElements(By.xpath("//*[@class=\"G43f7e\"]//li[@class=\"sbct\"]"));
		System.out.println(options.size());
		
		for(WebElement option: options) {
			if(option.getText().contains("tpoint")){
				option.click();
				break;
			}
		}
		
	}

}

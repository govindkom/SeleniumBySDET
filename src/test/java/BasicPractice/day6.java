package BasicPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// handle Dropdown
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement element=driver.findElement(By.id("oldSelectMenu"));
		
		Select sel= new Select(element);
		//	sel.selectByVisibleText("Green");
		
		//sel.selectByValue("3");
		
		// sel.selectByIndex(2);
		
		// selecting option from dropdownm without using methods
	List<WebElement>options=sel.getOptions();
	for(WebElement option: options) {
		if(option.getText().equals("Green")) 
		{
			option.click();
			break;
		}
	}
		
		
		driver.close();
		
		// if you have multiple dropdown then use generic method to call that dropdown 
	}

}

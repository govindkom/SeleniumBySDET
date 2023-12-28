package BasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActionWithMultipleKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// KeyboardActionWithMultipleKeys
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://text-compare.com/");
		
	WebElement inputbox1=	driver.findElement(By.id("inputText1"));
	WebElement inputbox2=driver.findElement(By.id("inputText2"));
	
	inputbox1.sendKeys("welcome to selenkium");
	
	// control A
	Actions act= new Actions(driver);
	act.keyDown(Keys.CONTROL);
	act.sendKeys("a");
	act.keyUp(Keys.CONTROL);
	act.perform();
	
	// control C
	act.keyDown(Keys.CONTROL);
	act.sendKeys("c");
	act.keyUp(Keys.CONTROL);
	act.perform();
	
	// TAB---shift to input 2 box
		act.sendKeys(Keys.TAB).perform();
		
		// control V
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		if(inputbox1.getAttribute("value").equals(inputbox2.getAttribute("value")))
				{
			System.out.println("text copied");
		}
		else
		{
			System.out.println("text not copied");
		}
	}

}

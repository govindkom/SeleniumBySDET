package BasicPractice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMouseRightClickAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
// HandleMouseRightClickAction
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act= new Actions(driver);
		act.contextClick(element).build().perform();
		
			Thread.sleep(1000);
			Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Copy']")).isDisplayed());
		System.out.println("Assertation passed");
		
	}

}

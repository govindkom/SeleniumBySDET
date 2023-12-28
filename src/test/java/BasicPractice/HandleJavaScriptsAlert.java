package BasicPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJavaScriptsAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// HandleJavaScriptsAlert

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// handle alert window with ===ok button
		/*
		 * driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click()
		 * ; Thread.sleep(2000); driver.switchTo().alert().accept();
		 */

		/*
		 * handle alert window with ===ok and cancel button
		 * driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click
		 * (); Thread.sleep(2000); //driver.switchTo().alert().accept(); //
		 * Assert.assertEquals(driver.findElement(By.id("result")).getText(),
		 * "You clicked: Ok");
		 * 
		 * driver.switchTo().alert().dismiss();
		 * Assert.assertEquals(driver.findElement(By.id("result")).getText(),
		 * "You clicked: Cancel");
		 * System.out.println("alert ahndled and assertation passed");
		 */

		// handle alert with input box and also capture text from alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert ele = driver.switchTo().alert();
		System.out.println("text from laert window:" + ele.getText());
		ele.sendKeys("govind");
		ele.accept();

	}

}

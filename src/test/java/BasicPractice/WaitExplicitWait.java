package BasicPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WaitExplicitWait
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
		
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h3[text()='Selenium'])[1]")));
		element.click();
		
		// by using genereic fiunctions
		By elelocator=By.xpath("(//h3[text()='Selenium'])[1]");
		waitForElementPresent(driver, elelocator, 10).click();
	}
	
	// GENERIC METHOD IF WE HAVE MORE TIME NEED TO USE EXPLICIT WIAT
	public static WebElement waitForElementPresent(WebDriver driver, By Locator, int timeout) {
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
		
		return driver.findElement(Locator);
	}

}

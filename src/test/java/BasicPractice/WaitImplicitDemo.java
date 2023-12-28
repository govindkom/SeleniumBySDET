package BasicPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitImplicitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// WaitImplicitDemo
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		// implicit wait systax
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.RETURN);
		
		driver.findElement(By.xpath("(//h3[text()='Selenium'])[1]")).click();
		
		/* adbvantages"
		max time 10sec
		easy
		add only once global wait */

	}

}

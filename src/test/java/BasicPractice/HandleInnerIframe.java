package BasicPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleInnerIframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// HandleInnerIframe
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
		Thread.sleep(1000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]")));
		System.out.println("outer frame passed");
		Thread.sleep(1000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]")));
		System.out.println("inner frame passed");
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("govind");
		
		
		
	}

}

package BasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// HandleFrames
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1");
		System.out.println("swicthed to frames");
		String text=driver.findElement(By.xpath("(//h1[normalize-space()='This is a sample page'])[1]")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		String text1=driver.findElement(By.xpath("(//h1[normalize-space()='This is a sample page'])[1]")).getText();
		System.out.println(text1);
	}

}

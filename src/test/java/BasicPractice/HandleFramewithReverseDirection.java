package BasicPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFramewithReverseDirection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		// HandleFramewithReverseDirection
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
// swithcing to outer frame
		driver.switchTo().frame("iframeResult");
		System.out.println("outer frame passed");
		Thread.sleep(1000);
		
		// switching to inner frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title=\"Iframe Example\"]")));
		System.out.println("inner frame passed");
		
		String text=driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']")).getText();
		System.out.println(text);
		
		driver.switchTo().parentFrame();
		String outertext=driver.findElement(By.xpath("//p[text()='You can use the height and width attributes to specify the size of the iframe:']")).getText();
	System.out.println(outertext);
	
	
	/* driver.switchTo().frame(name of the frame/ id of the frame)
	 driver.switchTo().frame(webelement)
	 driver.switchTo().frame(index)
	 
	 // main page back
	 driver.switchTo().defaultContent();
	 
	 // parent frtame back
	 driver.switchTo().parentFrame()*/
	
	}

}

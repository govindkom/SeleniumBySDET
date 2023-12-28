package BasicPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// JavaScriptExecutorDemo
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get(");

		// draw border & take Screenshot
		driver.get("https://demo.nopcommerce.com/");
	/*WebElement logo=	driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
	JavaScriptUtil.drawBorder(logo, driver);
	
	/// takes screenshot
	TakesScreenshot ts= (TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File trg= new File(".\\screenshots\\jsss.png");
	FileUtils.copyFile(src, trg);
	
	
	// getting title
	String title=JavaScriptUtil.getTitleByJS(driver);
		System.out.println(title);*/
		
		
		// click on element
		 WebElement ele = driver.findElement(By.id("gender-male"));
		JavaScriptUtil.clickElementByJS(ele, driver);
		
		// flash ===highlight element 
		// draw border & take Screenshot
		// getting title
		// click on element
		// generate alert
		// refresh the page
		// scroll up  scrool down the page
		// zoom in and zoom Out
	}

}

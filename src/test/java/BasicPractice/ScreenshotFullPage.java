package BasicPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotFullPage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
// ScreenshotFullPage
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		// full page screenshot  one way
//		File ts=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(ts, new File("screenshots1\\homepage2.png"));
		
		// full page screenshot  second way
//		TakesScreenshot ts= (TakesScreenshot) driver;
//		File src= ts.getScreenshotAs(OutputType.FILE);
//		File trg= new File(".\\screenshots\\homepage3.png");
//		FileUtils.copyFile(src, trg);
		
		// SS of section or portion of the page
//	WebElement element=	driver.findElement(By.xpath("//div[@class=\"product-grid home-page-product-grid\"]"));
//	File src= element.getScreenshotAs(OutputType.FILE);
//	File trg= new File(".\\screenshots\\featurefile.png");
//	FileUtils.copyFile(src, trg);
		
		// capture the screenshot of specific web/element
	WebElement logo=	driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
	File src= logo.getScreenshotAs(OutputType.FILE);
	File trg= new File(".\\screenshots\\logo.png");
	FileUtils.copyFile(src, trg);
	}

}

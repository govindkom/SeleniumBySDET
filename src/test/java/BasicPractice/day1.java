package BasicPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// launching browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(); // driver launch
		
		// url launch
		driver.get("https://www.amazon.in/");
		
		String Actual=driver.getTitle();
		
		Assert.assertEquals(Actual, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","title mismatch");
		
	System.out.println("current url of the page:"+driver.getCurrentUrl());
	System.out.println("pagesource :"+driver.getPageSource());
	
		driver.close();
	}

}

package BasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SizeAndLocationOfWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SizeAndLocationOfWebElement
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		
		// 1Location first method
		System.out.println(logo.getLocation());
		System.out.println(logo.getLocation().getX());
		System.out.println(logo.getLocation().getY());
		
		// 2second method==Location
		System.out.println(logo.getRect().getX());
		System.out.println(logo.getRect().getY());
		
		// Size first : mehtod
System.out.println(logo.getSize());
System.out.println(logo.getSize().getHeight());
System.out.println(logo.getSize().getWidth());
	
	// second methd
System.out.println(logo.getRect().getDimension().getHeight());
System.out.println(logo.getRect().getDimension().getWidth());

	
	
	
	}

}

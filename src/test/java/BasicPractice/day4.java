package BasicPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// find diff between FindElement() and FindElements()
		
		// findElement():
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.nopcommerce.com/");
		
		// findELement()---> return single WebElement
		
		/* scenario 01:
		WebElement searchbox= driver.findElement(By.id("small-searchterms"));
		searchbox.sendKeys("xyz");
		
		
		// scenario 02:
		WebElement footerlink=driver.findElement(By.xpath("//div[@class=\"footer-upper\"]//a"));
		System.out.println(footerlink.getText());
		
		// scenario 03
		
		//WebElement searchbox1= driver.findElement(By.id("small-searchtermss"));*/
		
		//findELements()---> return multiple WebElement
		//scenario 01;
//		List<WebElement> footerlink=driver.findElements(By.xpath("//div[@class=\"footer-upper\"]//a"));
//		System.out.println("no of elements present:"+footerlink.size());
//		for(int i=0;i<footerlink.size();i++) {
//			System.out.println(footerlink.get(i).getText());
//		}
		
		// scenario 02:
		List<WebElement>logo=driver.findElements(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
		System.out.println(logo.size());
		
		// scenario 03:
		//scenario 01;
				List<WebElement> footerlink1=driver.findElements(By.xpath("//div[@class=\"footer-upper\"]//a"));
				System.out.println("no of elements present:"+footerlink1.size());
				for(int i=0;i<footerlink1.size();i++) {
					if(footerlink1.get(i).getText().equalsIgnoreCase("Contact us"));
					
					
				}
		driver.close();
		
		
	}

}

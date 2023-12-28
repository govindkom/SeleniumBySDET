package BasicPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleChekbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HandleChekbox
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// select single checkbox
//		WebElement singlecbox=driver.findElement(By.id("vfb-6-0"));
//		singlecbox.click();
//		Assert.assertTrue(singlecbox.isSelected());
		
		
		// select mulptiple checkboxes
		List<WebElement>checkboxes=driver.findElements(By.xpath("//*[@type=\"checkbox\"]"));
		System.out.println(checkboxes.size());
		
		// using for loop
//		for(int i=0;i<checkboxes.size();i++) {
//			checkboxes.get(i).click();
//		}
//		
		// By using for each loop
//		for(WebElement chbox:checkboxes ) {
//			chbox.click();
//		}
		
		
		// 3. select multiple checkboxes as per choice
		// first and last
//		for(WebElement chbox:checkboxes ) {
//			String checkboxname=chbox.getAttribute("value");
//			if(checkboxname.equals("checkbox1")|| (checkboxname.equals("checkbox3")))
//			{
//				chbox.click();
//			}
//			
//		}
		
		// 4.th select last 2 checkboxes of last theree checkboxes
//		for(int i=1;i<checkboxes.size();i++) {
//			checkboxes.get(i).click();
//		}
//		
		// 5. select first 2 checkboxes
		for(int i=0;i<checkboxes.size();i++) {
			if(i<2) {
				checkboxes.get(i).click();
			}
			
		}
	}

}

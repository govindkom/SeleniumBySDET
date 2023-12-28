package BasicPractice;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
// check element is displayed(), is enabled(), isSelected()
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//
		driver.get("https://demo.nopcommerce.com/register");
		
		// isDisplayed(),     isEnabled()
		WebElement searchbox=driver.findElement(By.id("small-searchterms"));
		Assert.assertTrue(searchbox.isDisplayed());
		System.out.println("is displayed");
		
		Assert.assertTrue(searchbox.isEnabled());
		System.out.println("is Enabled");
		
		// is selected
		WebElement malebtn=driver.findElement(By.id("gender-male"));
		malebtn.click();
		
		Thread.sleep(2000);
		Assert.assertTrue(malebtn.isSelected());
		System.out.println("male btn is selected");
		
		WebElement femalebtn=driver.findElement(By.id("gender-female"));
		femalebtn.click();
		Assert.assertTrue(femalebtn.isSelected());
		System.out.println("female btn is selected");
		
		driver.close();
	}

}

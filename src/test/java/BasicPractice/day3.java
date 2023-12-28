package BasicPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// navigations method

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.navigate().to("https://maven.apache.org/");
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.close();
		
	}

}

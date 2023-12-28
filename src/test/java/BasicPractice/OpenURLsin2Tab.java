package BasicPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenURLsin2Tab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OpenURLsin2Tab
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		//driver.switchTo().newWindow(WindowType.TAB); // opening in new tab
		driver.switchTo().newWindow(WindowType.WINDOW);/// anothwer browser windoe
		driver.get("https://demo.opencart.com/");
	}

}

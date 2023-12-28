package BasicPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAuthenticationBasedPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HandleAuthenticationBasedPopup

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		// https://admin:admin@the-internet.herokuapp.com/basic_auth

		// https://username:password@URL

	}

}

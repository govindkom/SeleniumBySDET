package BasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		// clear and send Text ()
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement email=driver.findElement(By.id("Email"));
		email.clear();
		Thread.sleep(2000);
		email.sendKeys("admin@yourstore.com");
		
		// capturing value from text box
		System.out.println("value from getattribute :"+email.getAttribute("type")); //get value for that particular attribute
		
		System.out.println("value from gettext():"+email.getText());// get inner text only
		
		WebElement login=driver.findElement(By.xpath("//*[text()='Log in']"));
		
		System.out.println(login.getText());
		
		System.out.println(driver.findElement(By.xpath("//h1[normalize-space()='Admin area demo']")).getText());
		
		driver.close();
	}

}

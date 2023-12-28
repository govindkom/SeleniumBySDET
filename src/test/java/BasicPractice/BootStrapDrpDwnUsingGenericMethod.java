package BasicPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDrpDwnUsingGenericMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hdfcbank.com/");
		
		System.out.println("notifications disabled");
		
		driver.findElement(By.xpath("//a[text()='Select Product Type']")).click();
		Thread.sleep(1000);
		
		List<WebElement>productTypes=driver.findElements(By.xpath("//ul[@class=\"dropdown1 dropdown-menu\"]//li"));
		System.out.println("no of productTypes:"+productTypes.size());
		selectOptionFromDropDown(productTypes, "Accounts");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Select Product']")).click();
		
		List<WebElement>productsel=driver.findElements(By.xpath("//ul[@class=\"dropdown2 dropdown-menu\"]//li"));
		System.out.println(" no of product:"+productsel.size());
		selectOptionFromDropDown(productsel,"Current Accounts");
//		
	}


public static void selectOptionFromDropDown(List<WebElement> options, String value) {
	for(WebElement option: options) {
		if(option.getText().equalsIgnoreCase(value)) {
			option.click();
			break;
		}
	}
}
}

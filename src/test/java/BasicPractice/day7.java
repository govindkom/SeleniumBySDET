package BasicPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// handle bootstartp dropdown
		
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
		
		for(WebElement ptype: productTypes) {
			if(ptype.getText().equalsIgnoreCase("Accounts")) {
				ptype.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Select Product']")).click();
		
		List<WebElement>productsel=driver.findElements(By.xpath("//ul[@class=\"dropdown2 dropdown-menu\"]//li"));
		System.out.println(" no of product:"+productsel.size());
		
		for(WebElement produt :productsel ) {
			if(produt.getText().equals("Current Accounts")) {
				produt.click();
				break;
			}
		}

	}

}

package BasicPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Handle AutoSuggest Dropdown// use https://www.bing.com/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"sa_as\"]//span"));
		System.out.println(list.size());
		
		for(WebElement item:list) {
			if(item.getText().contains("download")) {
				item.click();
				break;
			}
		}
	}

}

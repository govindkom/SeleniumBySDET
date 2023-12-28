package BasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HandleCalender
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("onwardCal")).click();
		
		String date="26";
		String month="Jan";
		String year="2024";
		
		
			

	}

}

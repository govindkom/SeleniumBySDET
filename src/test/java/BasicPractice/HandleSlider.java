package BasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HandleSlider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HandleSlider
		
		// build===complete action
		// perform ==perform action
		
		//Action===Interface calling build method
		//		Actions==class called while performing actions
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		WebElement min_slider=driver.findElement(By.xpath("//div[@id=\"slider-range\"]//span[1]"));
		System.out.println("slider location:"+min_slider.getLocation());
		System.out.println("size of slider:"+min_slider.getSize());
		
		Actions act= new Actions(driver);
		act.dragAndDropBy(min_slider, 100, 0).perform();
		
		System.out.println("slider location:"+min_slider.getLocation());
		System.out.println("size of slider:"+min_slider.getSize());
		
		WebElement max_slider=driver.findElement(By.xpath("//div[@id=\"slider-range\"]//span[2]"));
		act.dragAndDropBy(max_slider, -150, 0).perform();
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Here List of products will be shown which are cost between 2100 and 6900.']")).getText(), "Here List of products will be shown which are cost between 2100 and 6900.");
	}

}

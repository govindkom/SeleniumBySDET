package BasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// MouseDragAndDrop
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();

		
		WebElement sorce = driver.findElement(By.id("box1"));
		WebElement target = driver.findElement(By.xpath("//div[text()='Italy']"));
		
		Actions act= new Actions(driver);
		act.dragAndDrop(sorce, target).perform();
	
	
	
	
	}

}

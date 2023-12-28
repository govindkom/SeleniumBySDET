package BasicPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DragAndDropImages
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]")));
		WebElement source=driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement target=driver.findElement(By.id("trash"));
		
		WebElement source1=driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
		
		Actions act= new Actions(driver);
		act.dragAndDrop(source, target).perform();
		act.dragAndDrop(source1, target).perform();
		
		
		
	}

}

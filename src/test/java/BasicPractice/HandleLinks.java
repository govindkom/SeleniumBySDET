package BasicPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HandleLinks
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//driver.findElement(By.linkText("Today's Deals")).click();
		//driver.findElement(By.partialLinkText("Today's")).click();

		
		// capture all the links 
		List<WebElement>alllinks=driver.findElements(By.tagName("a"));
		System.out.println("number of links present in page:"+alllinks.size());
		
		/* to real all links by using normal for loop
		for(int i=0;i<alllinks.size();i++) {
			System.out.println(alllinks.get(i).getText()); 
			System.out.println(alllinks.get(i).getAttribute("href"));
		}*/
		
		// to read all links by using for each loo[p
		for(WebElement link: alllinks) {
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}
	}

}

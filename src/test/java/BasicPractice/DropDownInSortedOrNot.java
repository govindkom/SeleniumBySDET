package BasicPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownInSortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DropDownInSortedOrNot
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();
		
		
	WebElement drpdn=driver.findElement(By.name("category_id"));
	Select select= new Select(drpdn);
	
	List<WebElement>options=select.getOptions();
	
	ArrayList originallist= new ArrayList();
	ArrayList tempList= new ArrayList();
	
	for(WebElement optio: options) {
		originallist.add(optio.getText());
		tempList.add(optio.getText());
	}
	
	// before sorting
	System.out.println("original list:"+originallist);
	System.out.println("tempList:"+tempList);
	Collections.sort(tempList);
		
	// after sorting
	
	System.out.println("original list:"+originallist);
	System.out.println("tempList:"+tempList);
	
	if(originallist.equals(tempList)) {
		System.out.println("dropdown sorted");
	}
	else
	{
		System.err.println("dropdown not sorted");
	}
	}

}

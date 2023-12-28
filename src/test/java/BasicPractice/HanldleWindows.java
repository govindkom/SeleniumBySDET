package BasicPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HanldleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// HanldleWindows
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		// getWindowHandle===> return single string id
		// getwindowhandles()===> return multiple browser windoes
		
//		String windowID=driver.getWindowHandle();
//		System.out.println(windowID);  // return single broeser window id

		Thread.sleep(3000);
		driver.findElement(By.id("windowButton")).click();  // open another browser window==child window
		
		Set<String>windowIDs=driver.getWindowHandles();  // rewturn ID's of multiple browser windows
		
		/* retrive id by using iterator()
		
		Iterator<String>iterator=windowIDs.iterator();
		String parentwindowid=iterator.next();
		String childwindowid=iterator.next();
		
		System.out.println(parentwindowid);
		System.out.println(childwindowid);*/
		
		
		// 2. second method-=====using List/ArrayList
		List<String>windowidlistnew=new ArrayList(windowIDs);  // converting set----> list
		/*String parentwindowid=windowidlistnew.get(0);  // return parent window
		String childwindowid=windowidlistnew.get(1); // return choild window
		
		System.out.println(parentwindowid);
		System.out.println(childwindowid);
		
		
		// how to switch window ID's for switching
		driver.switchTo().window(parentwindowid);
		System.out.println("parentwindowid title:"+driver.getTitle());
		
		driver.switchTo().window(childwindowid);
		System.out.println("childwindowid:"+driver.getTitle());*/
		
		// by using for each loop 
		for(String winid: windowidlistnew) {
			//System.out.println(winid);
			String titile=driver.switchTo().window(winid).getTitle();
			if(titile.equals("DEMOQA"))
			{
				driver.close();
			}
			System.out.println(titile);
		}
		
		//driver.close();// will close single browser window which is pinning
		//driver.quit(); // close all the browser windows
		
	}

}

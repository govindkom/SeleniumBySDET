package BasicPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrokenLinks {

	public static void main(String[] args) throws IOException {
		// BrokenLinks
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int brokenlinks=0;
		for(WebElement element: links) {
			String url=element.getAttribute("href");
			if(url==null || url.isEmpty())
			{
				System.out.println("url is empty");
				continue;
			}
			
			URL link=new URL(url);
			try {
				HttpURLConnection httpconne= (HttpURLConnection)link.openConnection();
				httpconne.connect();
				if(httpconne.getResponseCode()>=400)
				{
					System.out.println(httpconne.getResponseCode()+url+" is"+" broken links");
					brokenlinks++;
				}
				else
				{
					System.out.println(httpconne.getResponseCode()+url+" is"+" valid links");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("no of broken links:"+brokenlinks);

	}

}

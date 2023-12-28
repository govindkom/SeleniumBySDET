package WebTableHandle;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTableHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// StaticWebTableHandle
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// 1 Find Ouyt How Many rows in Table
		int row = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println("Row size:"+row);
		
		// 2. Find Out How Many Columns in Table
		int col = driver.findElements(By.xpath("//table[@id='customers']//tr//th")).size();
		System.out.println("col size:"+col);
		
		// 3. Retrieve the Specific row/column data
		String value=driver.findElement(By.xpath("//table[@id='customers']//tr[4]//td[1]")).getText();
		System.out.println("the Value is:"+value);
		
		//5. // print the contact as"Roland Mendel" And countery as "Austria"
		
		for(int r=1;r<=row;r++) {
			//table[@id='customers']//tr[4]//td[1]
			String data=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]//td[1]")).getText();
			System.out.println(data);
			
			if(data.equals("Microsoft"))
			{
				String contact=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]//td[2]")).getText();
				String country=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]//td[3]")).getText();
				
				System.out.println(data+" "+contact+" "+ country);
			}
		}
		
		/* 4. Retrrive all Rows/Columns data
		for(int r=1;r<=row;r++) 
		{
			for(int c=1;c<=col;c++) 
			{
				String data=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(data+"  ");
			}
			System.out.println();
		}*/
		
		
	}

}

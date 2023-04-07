package FetchMultipleLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic1 {
	
public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver (); // upcasting
			
			
			driver.get("https://kite.zerodha.com/");
			
			Thread.sleep(2000);
			
			List<WebElement> abc = driver.findElements(By.xpath("//a"));
			
			System.out.println(abc.size());
			
			for(int i=0;i<abc.size();i++) {
				
				System.out.println(abc.get(i).getText()+":"+abc.get(i).getAttribute("href"));
			}
			
}
}

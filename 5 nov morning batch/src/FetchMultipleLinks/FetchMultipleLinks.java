package FetchMultipleLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchMultipleLinks {
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver (); // upcasting
			
			
			driver.get("https://www.facebook.com/login/");
			
			Thread.sleep(2000);
			
			List<WebElement> Links = driver.findElements(By.xpath("//a"));
			
			System.out.println(Links.size());
			
			for(int i=0;i<Links.size();i++) {
				
				System.out.println(Links.get(i).getText()+":"+Links.get(i).getAttribute("href"));
			}
			
			
			
	
	
	
	

}
}

package FetchMultipleLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic2 {
	
public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver (); // upcasting
			
			
			driver.get("https://mpsconline.gov.in/candidate/login");
			
			Thread.sleep(2000);
			
			List<WebElement> hii = driver.findElements(By.xpath("//a"));
			
			System.out.println(hii.size());
			
			for(int i=0;i<hii.size();i++) {
				
				System.out.println(hii.get(i).getText()+":"+hii.get(i).getAttribute("href"));
			}

}
}
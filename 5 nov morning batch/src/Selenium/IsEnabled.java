package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver (); // upcasting
				
				
				driver.get("https://www.cricbuzz.com/premium-subscription/user/login");
				Thread.sleep(2000);
				
			WebElement continu=	  driver.findElement(By.xpath("//button[@type='button']"));
				  
				 
			boolean result=	continu.isEnabled() ;
			
			System.out.println(result);
			
			if(result==true) {
				System.out.println("webelement is enabled");
			}
			else {
				System.out.println("webelement is not enabled");
			}
				
				

}
	
}

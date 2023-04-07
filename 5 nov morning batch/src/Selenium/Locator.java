package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	
	
	public static void main(String[]args) throws InterruptedException  {
		
		WebDriver driver =new ChromeDriver (); // upcasting
				
				
			 //	driver.get("https://www.facebook.com/signup");
				
			//	Thread.sleep(3000);
				
 //	driver.findElement(By.tagName("input")).sendKeys("prasad"); // tagname should not be duplicate
				
  //driver.findElement(By.id("password_step_input")).sendKeys("prasad@123"); // password
	
 //	driver.findElement(By.name("firstname")).sendKeys("prasad"); // firstname
				
	//driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("kale");	//class name attribute should be present
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(2000);
		
	// driver.findElement(By.linkText("Messenger")).click();	
		
		driver.findElement(By.partialLinkText("Gam")).click();

}
}
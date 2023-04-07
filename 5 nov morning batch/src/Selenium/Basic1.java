package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic1 {
	
	public static void main (String[]args ) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasad\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver (); // upcasting
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
	//	driver.close();  // current tab closed 
		
	//	driver.quit();   // current browser closed
		
		String url =driver.getCurrentUrl();
		System.out.println(url);
		
		String expurl =("https://www.flipkart.com/");
		
		if (url.equalsIgnoreCase(expurl)) {
			System.out.println("Navigate to correct page");
			
		}
		else {
			System.out.println("Navigate to invalid page");
		}
		
	
	
	}

}

package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic2 {
	
	public static void main(String[]args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasad\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver (); // upcasting
		
		
		driver.get("https://www.flipkart.com/");
		
		Thread .sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread .sleep(3000);
		
		driver.manage().window().minimize();
		
		Thread .sleep(2000);
		driver.manage().window().maximize();
		
		
	}

}

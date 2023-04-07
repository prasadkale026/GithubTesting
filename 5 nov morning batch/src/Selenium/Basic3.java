package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic3 {
	
	public static void main(String[]args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasad\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver (); // upcasting
		
		driver.get("https://www.facebook.com/");
		
		Thread .sleep(5000);
		driver .navigate().to ("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		driver.close();

			

		
	}

}

package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic4 {
	
	
	public static void main(String[]args)throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasad\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver (); // upcasting
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		
		Dimension d = new Dimension (200 , 300)  ;
		driver.manage().window().setSize(d);
		
		Point p = new Point (100 , 400);
		driver.manage().window().setPosition(p);
	}

}

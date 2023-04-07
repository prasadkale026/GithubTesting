package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributemethod {
	
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver (); // upcasting
				
				
				driver.get("https://www.facebook.com/signup");
				
	WebElement ele = driver.findElement(By.xpath("(//input[@type='text'])[1]"));

	
	 String attribute = ele.getAttribute("data-type");
	 
	 System.out.println(attribute);
}
}

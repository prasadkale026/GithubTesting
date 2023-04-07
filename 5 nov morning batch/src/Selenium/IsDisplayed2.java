package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed2 {

	
	public static void main(String[]args) throws InterruptedException {
		
WebDriver driver =new ChromeDriver (); // upcasting
		
		
		driver.get("https://mpsconline.gov.in/candidate/login");
		
	WebElement password=	driver.findElement(By.xpath("//input[@type='password']"));
		
	
		boolean result =password.isDisplayed();
		
		System.out.println(result);
		
		if(result==true) {
			System.out.println("webelement is displayed");
		}
		else {
			System.out.println("webelement is not displayed");
		}
		
	 WebElement login =driver.findElement(By.xpath("//button[contains(@class,'btn')]"));
		boolean result1 =login.isEnabled();
		
		System.out.println(result1);
		
		if(result1==true) {
			System.out.println("webelement is enabled");
			
		}
		else {
			System.out.println("webelement is not enabled");
		}
}
}

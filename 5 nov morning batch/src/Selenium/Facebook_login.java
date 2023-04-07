package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook_login {
	
	
	public static void main(String[]args) throws InterruptedException {
		
	WebDriver driver =new ChromeDriver (); // upcasting

		
		driver.get("https://www.facebook.com/login/");
	
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7796775441");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7796775441");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}

	

}

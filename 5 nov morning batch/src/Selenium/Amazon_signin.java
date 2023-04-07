package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_signin {
	
	public static void main(String[]args) throws InterruptedException {
		
WebDriver driver =new ChromeDriver (); // upcasting
		
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("8668764354");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("prasad");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}

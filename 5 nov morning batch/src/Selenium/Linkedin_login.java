package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin_login {
	
	public static void main(String[]args) throws InterruptedException {
		
WebDriver driver =new ChromeDriver (); // upcasting
		
		
		driver.get("https://www.linkedin.com/home");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='input__input']")).sendKeys("prasadkale026@gmail.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("prasad");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='sign-in-form__submit-button']")).click();
	}
	
	

}

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_signup {
	public static void main(String[]args) throws InterruptedException  {
		
		WebDriver driver =new ChromeDriver (); // upcasting
				
				
			 	driver.get("https://www.facebook.com/signup");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[contains(@class,'_58')][1]")).sendKeys("prasad");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[contains(@class,'_58')][1]")).clear();
		Thread.sleep(3000);
		
        driver.findElement(By.xpath("//input[contains(@class,'_58')][1]")).sendKeys("shivraj");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kale");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[contains(@name,'reg')]")).sendKeys("1234567890");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("123@prasad");
	
		
	
       
	}

}

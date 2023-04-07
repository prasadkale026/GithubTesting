package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextmethod {
	
	public static void main(String[]args) throws InterruptedException {
		
WebDriver driver =new ChromeDriver (); // upcasting
		
		
		driver.get("https://www.facebook.com/signup");
		
	WebElement text = driver.findElement(By.xpath("//div[@class='_8esf _8f3m _9bpz _9bq9']"));
		
		 String result = text.getText();
		
         System.out.println(result);
}
}
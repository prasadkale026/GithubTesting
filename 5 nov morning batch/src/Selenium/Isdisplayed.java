package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {

	
public static void main(String[]args) throws InterruptedException  {
		
		WebDriver driver =new ChromeDriver (); // upcasting
				
				
				driver.get("https://www.facebook.com/signup");
				
				
		WebElement customGender=driver.findElement(By.xpath("//input[@name='custom_gender']"));
				
		
		boolean result =customGender.isDisplayed();
		
		System.out.println(result);
		
		if (result==true) {
			System.out.println("element is displayed");	
		}
		else {
			System.out.println("element is not displayed");
		}
}
}
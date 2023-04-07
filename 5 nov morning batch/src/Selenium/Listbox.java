package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	
	
	public static void main(String[]args) throws InterruptedException  {
		
		WebDriver driver =new ChromeDriver (); // upcasting
				
				
			 	driver.get("https://www.facebook.com/signup");
				
				Thread.sleep(3000);
				
		  	WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
				
				Select s =new Select (date);
				
				s.selectByIndex(25);
			//	s.selectByValue("26");
			//	s.selectByVisibleText("26");
				System.out.println(s.getFirstSelectedOption().getText());
				 Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Select p = new Select(month);
		
		//p.selectByIndex(3);
	//	p.selectByValue("4");
		p.selectByVisibleText("Apr");
		System.out.println(p.getFirstSelectedOption().getText());
		Thread.sleep(2000);
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select p1 =new Select(year);
		
	//	p1.selectByIndex(2000); // not done by this method
		p1.selectByValue("2001");
	//	p1.selectByVisibleText("2001");
		System.out.println(p1.getFirstSelectedOption().getText());
		
		
		
		
		
		
		
		
		
        
}
}
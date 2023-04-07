package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Signup2 {
	

	public static void main(String[]args) throws InterruptedException  {
		
WebDriver driver =new ChromeDriver (); // upcasting
		
		
	 	driver.get("https://www.facebook.com/signup");
		
	 	driver.findElement(By.name("firstname")).sendKeys("prasad");
	 	Thread.sleep(2000);
	 	driver.findElement(By.name("lastname")).sendKeys("kale");
	 	Thread.sleep(2000);
	 	driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
	 	Thread.sleep(2000);
	 	driver.findElement(By.id("password_step_input")).sendKeys("prasad@123");
	 	Thread.sleep(2000);
	 	
	  WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
	  Select x =new Select(date);
	  x.selectByIndex(25);
	  Thread.sleep(2000);
	  
	 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	 Select y =new Select(month);
	 y.selectByValue("4");
	 Thread.sleep(2000);
	 
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	Select z = new Select(year);
	z.selectByVisibleText("2001");
	Thread.sleep(2000);
	
    driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();	 

}

}
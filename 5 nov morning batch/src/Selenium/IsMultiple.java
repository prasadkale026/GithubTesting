package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {
	
	
		public static void main(String[]args) throws InterruptedException  {
			
			WebDriver driver =new ChromeDriver (); // upcasting
					
					
				 	driver.get("https://www.facebook.com/signup");
				 	
					WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
					
					Select p = new Select(month);
					
					boolean result = p.isMultiple();
					
					System.out.println(result);
					
					if(result==true) {
						System.out.println("The given Listbox is Multiselected");
					}
					else {
						System.out.println("Listbox is Single Selected");
					}
				 	
				 	
		

}
	}

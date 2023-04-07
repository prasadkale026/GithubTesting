package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListMultiProgram {
	
	
	public static void main(String[]args) throws InterruptedException  {
		
		WebDriver driver =new ChromeDriver (); // upcasting
				
				
			 	driver.get("https://www.facebook.com/signup");
			 	
				WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
				
				Select p1 =new Select(year);
			
				
				List<WebElement> option = p1.getOptions();
				
				int size = option.size(); // to get size of listbox
				
				System.out.println(size);
				
				//to print all the options present in listbox
				
				for(int i=0;i<=option.size()-1;i++) {
					System.out.println(option.get(i).getText());
				}
				
				WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
				
				Select p = new Select(month);
				
			List<WebElement> happy = p.getOptions();
			int size1 = happy.size();
			System.out.println(size1);
			for(int i=0;i<=happy.size()-1;i++) {
				System.out.println(happy.get(i).getText());
			}
			WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']"));
			
			Select s =new Select (date);
			List<WebElement> prasad = s.getOptions();
			int size2 = prasad.size();
			System.out.println(size2);
			for(int i=0;i<=prasad.size()-1;i++) {
				System.out.println(prasad.get(i).getText());
			}
				 
	}
}

package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetallSelectedOptions {
	
public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver (); // upcasting
				
				
				driver.get("https://www.facebook.com/signup");
				WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
				
				Select p = new Select(month);
				
			List<WebElement> alloption = p.getAllSelectedOptions();
			
			for(int i=0;i<=alloption.size()-1;i++) {
				System.out.println(alloption.get(i).getText());
			}

}
}
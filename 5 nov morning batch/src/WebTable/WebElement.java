package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {
	
	
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver (); // upcasting
				
				
				driver.get("https://www.w3schools.com/html/html_tables.asp");
				Thread.sleep(2000);
				
				List<org.openqa.selenium.WebElement> noOfrows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
				
				System.out.println(noOfrows.size());
				
				List<org.openqa.selenium.WebElement> noOfcells = driver.findElements(By.xpath("//table[@id='customers']//tr[\"+(i+1)+\"]//td"));
				
				System.out.println(noOfcells.size());
				
				
				
				
				
	}

}

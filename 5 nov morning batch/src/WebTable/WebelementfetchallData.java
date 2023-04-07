package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementfetchallData {
	
public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver (); // upcasting
				
				
				driver.get("https://www.w3schools.com/html/html_tables.asp");
				Thread.sleep(2000);
				
				
				List<org.openqa.selenium.WebElement> noOfrows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
				
				
				for(int i=1;i<noOfrows.size();i++) {			
			 List<org.openqa.selenium.WebElement> noOfcells = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
				
			 for(int cell=0;cell<noOfcells.size();cell++) {
				 System.out.print(noOfcells.get(cell).getText()+" ");
			 }
			 System.out.println();
				
				}
}
}

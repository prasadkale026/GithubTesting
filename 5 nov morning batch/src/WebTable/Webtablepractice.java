package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablepractice {
	
	
public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver (); // upcasting
				
				
				driver.get("https://demo.guru99.com/test/table.html");
				
				List<WebElement> rows = driver.findElements(By.xpath("//table[@cellspacing='1']//tr"));
				
				for(int i=0;i<=rows.size();i++) {
					
				List<WebElement> cells = driver.findElements(By.xpath("//table[@cellspacing='1']//tr["+(i+1)+"]//td"));
					for(int j=0;j<cells.size();j++) {
						System.out.print(cells.get(j).getText()+" ");
						
						
					}
					System.out.println();
					
				}
			
}
}    


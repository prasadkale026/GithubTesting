package PopUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
	
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> id = driver.getWindowHandles();
		
		ArrayList<String>al=new ArrayList<String>(id);
		
		String cbadd = al.get(1); // child browser address
		
		driver.switchTo().window(cbadd);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		driver.switchTo().window(al.get(0));
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Thread.sleep(3000);
        
		driver.switchTo().window(al.get(1));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='WebdriverIO'])[1]")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(al.get(0));
		
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		
		
		
		
		
		
		
		
	}

}

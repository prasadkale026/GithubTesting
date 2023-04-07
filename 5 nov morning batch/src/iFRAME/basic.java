package iFRAME;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic {
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver (); // upcasting
				
				
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
				
				WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				driver.switchTo().frame(iframe);// changed selenium focus from main page to iframe
				

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				driver.findElement(By.xpath("//button[@type='button']")).click();
				

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				driver.switchTo().defaultContent(); // selenium focused changed to main page
				

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				//driver.switchTo().parentFrame();
				
				driver.findElement(By.xpath("//a[@id='tryhome']")).click();
				

}
}
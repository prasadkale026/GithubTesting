package Wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitExplicitwait {
	
	

	public static void main(String[]args) throws InterruptedException {
		
	WebDriver driver =new ChromeDriver (); // upcasting
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));

		
		driver.get("https://www.facebook.com/login/");
		
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7796775441");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7796775441");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//bu[@name='login']"))).click();
		
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	

}
}
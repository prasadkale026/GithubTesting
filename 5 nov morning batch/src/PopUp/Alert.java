package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver (); // upcasting
				
				
				driver.get("https://nxtgenaiacademy.com/alertandpopup/");
				Thread.sleep(2000);
				
			//	driver.findElement(By.xpath("//button[@name='alertbox']")).click();
				
			//	Thread.sleep(2000);
				
			//	driver.switchTo().alert().accept();
				
			
			//	driver.findElement(By.xpath("//button[@onclick='myFunctionTwo()']")).click();
				
				//Thread.sleep(2000);
				
			//	driver.switchTo().alert().dismiss();
				
				driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
				
				Thread.sleep(5000);
				
				org.openqa.selenium.Alert alt = driver.switchTo().alert();
				
				alt.sendKeys("Yes");
				
				Thread.sleep(2000);
				
				alt.accept();
				
				
	
	
	

}
}

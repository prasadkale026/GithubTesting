package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BasicScreen {
	

		public static void main(String[]args) throws InterruptedException, IOException  {
			
			WebDriver driver =new ChromeDriver (); // upcasting
					
					
				 	driver.get("https://www.facebook.com/signup");
				 	
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination =new File("C:\\Users\\Prasad\\Pictures\\Screenshots\\prasad.jpg");
		
		FileHandler.copy(source, destination);

}
}
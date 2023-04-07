package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Basic1 {
	
	public static void main(String[]args) throws InterruptedException, IOException  {
		
		WebDriver driver =new ChromeDriver (); // upcasting
				
				
			 	driver.get("https://www.facebook.com/signup");
			 	for(int i=1;i<=5;i++) {
			 		
			 	File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 	
			// 	File destination =new File ("C:\\Users\\Prasad\\Pictures\\Screenshots\\multiple"+i+".jpg");
			 	
			 	String random=RandomString.make(3);
				
				File destination =new File ("C:\\Users\\Prasad\\Pictures\\Screenshots\\Happy"+random+".jpg");
			 	
			 	FileHandler.copy(source, destination);
			 	}

}
}
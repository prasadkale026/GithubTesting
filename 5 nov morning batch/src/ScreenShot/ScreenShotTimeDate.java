package ScreenShot;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotTimeDate {
	
	
	public static void main(String[]args) throws InterruptedException, IOException  {
		
		WebDriver driver =new ChromeDriver (); // upcasting
				
				
		driver.get("https://i.pinimg.com/originals/a3/fb/5d/a3fb5def518705c9cc739299234c2779.jpg");
			
		for(int i=1;i<=3;i++) {
			
			File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String random = RandomString.make(3);
			
			File destination =new File("C:\\Users\\Prasad\\Pictures\\Screenshots\\prasad"+random+""+timestamp()+".jpg");
			
			FileHandler.copy(source, destination);
		}

}

	public static String timestamp() {
		// TODO Auto-generated method stub
		return new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
	}
		
	}
	

	
	
	
	
	

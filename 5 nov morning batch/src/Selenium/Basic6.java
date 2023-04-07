package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic6 {
	
	
	public static void main(String []args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Prasad\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver (); // upcasting
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
	//	driver.close(); // current tab closed
		
	//	driver.quit(); // current browser closed
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String exptile = ("online shopping site for Mobiles,Electronics,Furniture");
		
		if (title.equalsIgnoreCase(exptile)) {
			System.out.println("Navigate to correct page ");
			
		}
		else {
			System.out.println("Navigate to invalid page");
		
		}
		
		
		
		
		
}

}

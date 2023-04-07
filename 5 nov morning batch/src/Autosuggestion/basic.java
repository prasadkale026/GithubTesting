package Autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic {
	
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("oppo");
		
		Thread.sleep(2000);
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='aajZCb']"));
		
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		//for(Webelement Eachoption : options) { // advance for loop
		
		//System.out.println(Eachoption.gettext());
		
		
	}

}

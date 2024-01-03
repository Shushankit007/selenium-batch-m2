package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Method {
 
	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("https://www.amazon.in/amazonprime?ref_=nav_cs_primelink_nonmember")).click();
	//driver.close();
	driver.quit(); 																						
	}
}

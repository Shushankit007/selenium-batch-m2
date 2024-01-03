package Locator;

import org
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();	

	driver.manage().window().maximize();
	
	driver.get("https://www.zomato.com/india");
	
	 String title = driver.getTitle();
	  System.out.println(title);
	  
	  String url = driver.getCurrentUrl();
	  System.out.println(url);
	 	 
	  driver.close();
	}
}

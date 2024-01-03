package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();	

	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/?hl=en");
	
	driver.findElement(By.linkText("Sign up")).click();
	
	}
}

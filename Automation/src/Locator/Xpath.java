package Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();	

	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/login");
}
}

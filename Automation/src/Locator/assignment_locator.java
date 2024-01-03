package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_locator {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();	

	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("admin123");
	
	Thread.sleep(1000);
	driver.findElement(By.className("oxd-button")).click();
	
	Thread.sleep(2000);	
	driver.findElement(By.className("oxd-userdropdown-name")).click();
	
	Thread.sleep(3000);	
	driver.findElement(By.linkText("Logout")).click();
	
	}
}

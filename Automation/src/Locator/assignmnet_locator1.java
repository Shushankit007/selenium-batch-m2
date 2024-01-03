package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmnet_locator1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();	

		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Firstname")).sendKeys("Shushankit");
		driver.findElement(By.name("Lastame")).sendKeys("Mandade");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("shshkit.m@gmail.com");
		driver.findElement(By.id("password")).sendKeys("admin123");
		driver.findElement(By.id("Confirmpassword")).sendKeys("admin123");
		Thread.sleep(2000);
		
		Thread.sleep(2000);	
		driver.findElement(By.className("Reg")).click();
		
		}
}

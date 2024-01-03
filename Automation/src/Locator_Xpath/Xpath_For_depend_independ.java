package Locator_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_For_depend_independ {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[text()= ]"));
		//driver.findElement(By.xpath("//input[contains(@class,'Pke')]")).sendKeys("iphone",Keys.ENTER);
		
		//WebElement iphonePrice = driver.findElement(By.xpath(""));
	//System.out.println(iphonePrice.getText());	
	}
}

package LaunchBrowser;

import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Demo {
	
	static WebDriver driver ;
 
	public static void main(String[] args) {
		
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name");
	 	 String browser = sc.next();
	 	
	 
	 if (browser.equals("chrome"))
	 {
		 driver = new ChromeDriver();
	 }
	 else if (browser.equals("firefox"))
	 {
		 driver =  new FirefoxDriver();
	 }
	 else 
	 {
		 System.out.println("Invalid Browser");
	 }
	 
	
}
}

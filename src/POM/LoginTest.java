package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LoginTest {
	
		public static void main(String []args) throws InterruptedException {
			

		   System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			Thread.sleep(2000);
		
			Loginpage loginpage1=new Loginpage(driver);
	
	
			 loginpage1.getusernameTab();
			 
			 loginpage1.getPasswordTab();
			 
			 loginpage1.getbutton();
		
			 HomepageClass hp=new HomepageClass(driver);
			 
			 hp.getprofilelink();
			 hp.getlogoutlink();
    }
}

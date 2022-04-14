package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling1 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//step-3
			driver.get("http://the-internet.herokuapp.com/basic_auth");
			
			//syntax
			
            // http://admin:admin@the-internet.herokuapp.com/basic_auth
			// http://user:passwordthe-internet.herokuapp.com/basic_auth
			
			driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}

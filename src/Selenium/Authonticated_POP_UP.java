package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authonticated_POP_UP {

	public static void main(String[] args) {
	
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(" http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		// Syntex: (" http://user:password@the-internet.herokuapp.com/basic_auth")
		// (" http://admin:admin@the-internet.herokuapp.com/basic_auth")
	}

}

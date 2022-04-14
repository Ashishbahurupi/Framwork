package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_HandlingA {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://the-internet.herokuapp.com/key_presses");
			
			
			driver.manage().window().maximize();
			
			Actions act= new Actions(driver);
			
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(2000);
			
			act.sendKeys(Keys.BACK_SPACE).perform();
			Thread.sleep(2000);
			
			act.sendKeys(Keys.ARROW_RIGHT).perform();
			Thread.sleep(2000);
			
			

	}

}

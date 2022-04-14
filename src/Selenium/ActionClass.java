package Selenium;

import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//step-3
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			//step-4- Scrolling
			JavascriptExecutor js=(JavascriptExecutor)driver;
				
			js.executeScript("window.scrollBy(0,600)");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id='dropdown-class-example']")).click();
			Thread.sleep(3000);
			
			
			Actions act=new Actions(driver);
		    
		    act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(2000);
			
			act.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).build().perform();
			Thread.sleep(2000);
			
			driver.close();
			

	}

}

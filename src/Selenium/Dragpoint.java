package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragpoint {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//step-3
			driver.get("https://jqueryui.com/slider/");
			
			//step-4- Scrolling
			JavascriptExecutor js=(JavascriptExecutor)driver;
				
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(3000);
			WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));

			driver.switchTo().frame(frame);
			Thread.sleep(3000);
            
			WebElement slider=driver.findElement(By.xpath("//*[@id='slider']//span"));
			
			Actions act=new Actions(driver);
			
			act.clickAndHold(slider).moveByOffset(400, 0).release().build().perform();
			Thread.sleep(3000);
			
			act.clickAndHold(slider).moveByOffset(-200, 0).release().build().perform();
			
			
			
			Thread.sleep(8000);
			driver.close();			
			
	}

}

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_com {

	public static void main(String[] args) throws InterruptedException {
	
		  System.setProperty("webdriver.chrome.driver" , "C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://ticker.finology.in/");
		
		Thread.sleep(2000);
		
		   WebElement link1=driver.findElement(By.xpath("//a[@class='nav-link login']"));
		   
		   link1.click();
		
		 JavascriptExecutor js=(JavascriptExecutor) driver;
			
			js.executeScript("window.scrollBy(0, 600)");
		
		

	}

}

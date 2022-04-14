package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboaredactionMultipleKeys {

	public static <javaSriptExecuter> void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get(" https://text-compare.com/");
			
			
			driver.manage().window().maximize();
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript(" window .scrollBy(0,300)");
			
			
			WebElement input1= driver.findElement(By.xpath(" //*[@id=\"inputText1\"]"));
			
			input1.sendKeys(" Welcome to selenium");
			 Actions act= new Actions(driver);
			 // Ctrl+a
			 act.keyDown(Keys.CONTROL);
			 act.sendKeys("c");
			 act.keyUp(Keys.CONTROL);
			 act.perform();
			 
			 //Tab-Shift to input2
			 act.keyDown(Keys.TAB);
			 act.perform();
			 
			 
			 //Ctrl+c
			 act.keyDown(Keys.CONTROL);
			 act.sendKeys("v");
			 act.keyUp(Keys.CONTROL);
			 act.perform();
			
			WebElement input2= driver.findElement(By.xpath(" //*[@id=\"inputText1\"]"));
			
			
			
			
			
	}

}

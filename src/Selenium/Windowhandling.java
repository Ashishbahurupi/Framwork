package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) throws InterruptedException {
      
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
		
		//Step-1
		WebDriver driver =new ChromeDriver();
		
		//step-2
		driver.manage().window().maximize();
		
		//step-3
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//step-4- Scrolling
		JavascriptExecutor js=(JavascriptExecutor)driver;
	
	    js.executeScript("window.scrollBy(0,600)");
	    Thread.sleep(3000);
	    
	   String ParentTab= driver.getWindowHandle();
	   
	   WebElement button =driver.findElement(By.xpath("//*[@id=\"opentab\"]"));
	   
	   button.click();
	   
	    System.out.println( ParentTab);
	   
	   Set<String> allTab = driver.getWindowHandles();
	   driver.switchTo().window(ParentTab);
	   
	   for (String tab:allTab) {
	    	
	    	System.out.println(tab);
	    	
	    	if (!tab.equals(ParentTab)) {
	    		
	    		
	    	System.out.println(tab);
	    	
	    		Thread.sleep(5000);
	    		
	    		driver.switchTo().window(tab);
	    	}
	    	
	    		Thread.sleep(5000);
	    		
	    		driver.switchTo().window(ParentTab);
	    		
	 
   
	   }

	   }
	}



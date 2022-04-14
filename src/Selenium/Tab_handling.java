package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab_handling {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Slenium Jar\\Chrome_98\\chromedriver.exe");
		
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
	    
	    //step-5
	   String parentTab= driver.getWindowHandle();
	   
	    
	    //step-6
	    WebElement button=driver.findElement(By.xpath("//*[@id='opentab']"));
	    button.click();
	    
	    //step-7-in child tab getting title
	    Set<String> allTab=driver.getWindowHandles();
	    
	    for (String tab:allTab) {
	    	
	    	System.out.println(tab);
	    	
	    	if (!tab.equals(parentTab)) {
	    		
	    		driver.switchTo().window(tab);
	    		System.out.println(driver.getTitle());
	    		
	    	}
	    	}
	    Thread.sleep(3000);
	    //step-8 moving back to parent window
	    driver.switchTo().window(parentTab);
	    System.out.println(driver.getTitle());
	    
	    Thread.sleep(5000);
	    driver.quit();


	}

}

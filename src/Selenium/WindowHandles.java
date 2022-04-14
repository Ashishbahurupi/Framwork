package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
	 
     WebDriver driver=new ChromeDriver();
     
     driver.get(" https://vctcpune.com/selenium/practice.html");
     
     driver.manage().window().maximize();
     
     JavascriptExecutor js=(JavascriptExecutor)driver;
     
     js.executeScript(" window .scrollBy(0,600)");
     Thread.sleep(2000);

       //step-5
	   String parentTab= driver.getWindowHandle();
	   System.out.println(parentTab);
	   
	    
	    //step-6
	    WebElement button=driver.findElement(By.xpath("//*[@id='opentab']"));
	    button.click();
	    
	    //geting child tab titale.
	   Set<String> allTab= driver.getWindowHandles();
	    driver.switchTo().window(parentTab);
	    
	   for(String tab:allTab) {
		   
		   System.out.println(tab);
		   
		   if(!tab.equals(allTab)) {
			   
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

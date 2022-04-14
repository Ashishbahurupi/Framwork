package Selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.Strings;

public class HandleWindow {

	public static void main(String[] args) {

		  System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get(" https://opensource-demo.orangehrmlive.com/");
			
			driver.manage().window().maximize();
			
			
			//getwindowhandle()
			
			String windowId=driver.getWindowHandle();
			
			//System.out.println(windowId);
			
			WebElement childWnd =driver.findElement(By.xpath(" //*[@id=\"footer\"]/div[1]/a"));
		    childWnd.click();
					
	        // getwindowhandles()
		    
		    Set<String>  windowIds=driver.getWindowHandles();
			
		   // System.out.println(windowIds);
		    
		    // First method 
		    
		  /*  Iterator<String> It=windowIds.iterator();
		    
		  String  parentId= It.next();
		  
		  String  childId= It.next();
		  
		  System.out.println("parent window id "+ parentId );
		  
		  System.out.println("parent window id "+ childId );
		  */
		  
		    
		    // Second method  using List/Array list
		    
		    
		List<String> WindowIDsList=new ArrayList();
		
		String parentwindowIDs=WindowIDsList.get(0);
		String childwindowIDs=WindowIDsList.get(1);
		
		System.out.println(" parentIDs "+parentwindowIDs );
		
		System.out.println(" parentIDs "+childwindowIDs );
		
		
		  
		    
		    
			
			

	}

}
 
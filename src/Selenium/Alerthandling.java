package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//step-3
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			
			//step 1) alert window with ok button
		     driver.findElement(By.xpath("//*[@onclick='jsAlert()']")).click();  // simple alert().
		    
		     Thread.sleep(3000);
		     driver.switchTo().alert().accept();
		    
		  
		    
		   //  step 2) alert window with ok and cancel button
            driver.findElement(By.xpath("//*[@onclick='jsConfirm()']")).click();
		    
		    Thread.sleep(3000);
		    
		    driver.switchTo().alert().accept();
		    driver.switchTo().alert().dismiss();
		    
		    //Step3) Alert window with text box(confirmation alert)
		   
			
	         driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	        
		
			
			//String ref =Ele.getText();
			
			//if(ref.contains("Welcome")) {
				
				//System.out.println("Accepted");
		        //Ele.accept();
			//}	
			//else {
				
				//System.out.println(" Dismissed");
				//alertwindow1.dismiss();
			//}
			
			
			
			
			
			
			
			
			//System.out.println();
			// Thread.sleep(2000);
			// alertwindow1.sendKeys("welcome");
			 //Thread.sleep(2000);
			 //alertwindow1.accept();
	}

	private static TargetLocator SwitchTo() {
		// TODO Auto-generated method stub
		return null;
	}
}

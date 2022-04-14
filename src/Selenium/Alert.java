package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//step-3
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			
			
		  /*  driver.findElement(By.xpath("//*[@onclick='jsAlert()']")).click();
		    
		    Thread.sleep(2000);
		    driver.switchTo().alert().accept();
		    
		    driver.findElement(By.xpath(" //*[@onclick='jsConfirm()']")).click();
		    
		    Thread.sleep(2000);
		   // driver.switchTo().alert().accept();
		    driver.switchTo().alert().dismiss();*/
			
		    //Alert window with text box
		    //driver.findElement(By.xpath("//*[@onclick='jsPrompt()']")).click();
	//	     Alert alertwindow=driver.switchTo().alert();
		    
		    
		    
		    
		
	}

}

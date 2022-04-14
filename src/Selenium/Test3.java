package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get(" https://opensource-demo.orangehrmlive.com/");

		//Thread.sleep(2000);
		
		// WebElement username=driver.findElement(By.name("email"));
		
		Thread.sleep(2000);
		
		 WebElement username=driver.findElement(By.id("txtUsername"));
	        username.sendKeys("Admin");
	        
	        Thread.sleep(2000);
	        
	        WebElement password=driver.findElement(By.id("txtPassword"));
	        password.sendKeys("admin123");
	        Thread.sleep(2000);
		
		
		
	    WebElement usename= driver.findElement(By.cssSelector(" input.button"));
	    
	    usename.click();
	   
	    //usename.sendKeys("admin");
		Thread.sleep(8000);
		
		// driver.close();
		

	}

}

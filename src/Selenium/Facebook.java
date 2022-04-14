package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver" , "C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com/login/");
		 
		 Thread.sleep(2000);
		 
        WebElement username=driver.findElement(By.id("email"));
        username.sendKeys("9503888983");
        
        Thread.sleep(2000);
        
        WebElement password=driver.findElement(By.id("pass"));
        password.sendKeys(" ashish@123");
        Thread.sleep(2000);
        
       WebElement button= driver.findElement(By.id("loginbutton"));
        
       button.click();
        
       Thread.sleep(2000);
       WebElement link1=driver.findElement(By.linkText("Forgotten password?"));
       
       link1.click();
       
       Thread.sleep(2000);
       
       
       
       
       WebElement link2 =driver.findElement(By.name("reset_action"));
       link2.click();
         Thread.sleep(2000);
       
       WebElement link3 =driver.findElement(By.className(" inputtext _9o1w"));
       link3.click();
       
		 
		 Thread.sleep(8000);
	}

}
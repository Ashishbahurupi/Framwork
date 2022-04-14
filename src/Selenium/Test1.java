package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\geckodriver.exe");
			
			WebDriver driver=new FirefoxDriver();
			
			driver.get("https://mail.google.com/mail/u/0/#inbox");
			
           driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			driver.manage().window().minimize();
			
			Thread.sleep(2000);
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			String T1 =driver.getTitle();
			
			String T2 ="Gmail"; 
			System.out.println(T1);
			
			if(T1.equals(T2)){
				
				System.out.println(" Pass test case");
			}
					
			else {
				
				System.out.println(" fail test case");
				
			}
			}
			
			
			
			
	}

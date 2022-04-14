package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
		
		//Step-1
		WebDriver driver =new ChromeDriver();
		
		//step-2
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		//step-3
	    driver.manage().window().maximize();
		
        JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript(" window .scrollBy(0,500)");
		
	  WebElement options=driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
	   Select option=new Select(options);
	   
	   option.selectByIndex(2);
	  // option.selectByValue("");
	  // option.selectby();
	   
	   
	  // driver.close();
	

	}

}

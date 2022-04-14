package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://vctcpune.com/selenium/practice.html");
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript(" window .scrollBy(0,500)");
			
			WebElement option =driver.findElement(By.xpath("//*[@id=\"serviceid1\"]/div/div/div[4]"));
			
			
		    Select opt =new Select(option);
			
		    
		    opt.selectByIndex(3);
			

	}

}

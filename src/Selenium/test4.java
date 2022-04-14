package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4 {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript(" window .scrollBy(0,500)");
		
		List <WebElement> cheakbox = driver.findElements(By.xpath("//*[@id=\"serviceid1\"]/div/div/div[4]"));
		
		
		for( WebElement ele :cheakbox ) {
			
			String attribute= ele.getAttribute("value");
			System.out.println(attribute);
		}
	
	}

}

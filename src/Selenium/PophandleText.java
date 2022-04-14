package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PophandleText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" http://the-internet.herokuapp.com/javascript_alerts");
		
		//Alertwindow with ok button 
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		//alert window with   ok and cancel button
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		// driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button")).click();
		Thread.sleep(2000);
		
		Alert alertwindow =driver.switchTo().alert();
		
		System.out.println(alertwindow.getText());
		
		alertwindow.sendKeys("Welcome");
		
		alertwindow.accept();
		
		
		
		
		
		
		
	
		

	}

}

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_calender {

	public static void main(String[] args) throws InterruptedException {
		

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
			
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://jqueryui.com/datepicker/");
			
			//step-4 checking frames & handling frames
			int s=driver.findElements(By.tagName("iframe")).size();
			System.out.println("Total frameon html is " + s);
			
			WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));
			
			driver.switchTo().frame(frame);
			
			//Step-5 click on the frame webelement
			WebElement id=driver.findElement(By.xpath("//*[@id='datepicker']"));
			id.click();
			
			//step-6 handling calender
			
			while(true) {
				
				String month=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
				System.out.println(month);
			
				if (!month.equalsIgnoreCase("December 2019")) {
					
					driver.findElement(By.xpath("//*[@title='Prev']")).click();
				}
				
				else {
					break;
				}
			}
			
			int date=22;
			
			//date selection
			driver.findElement(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()='"+date+"']")).click();
		
			
			
			Thread.sleep(8000);
			driver.close();

	}

}

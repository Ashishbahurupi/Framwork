package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//step-1
			driver.get("https://ticker.finology.in/");
			
			// step2:
           TakesScreenshot tss=(TakesScreenshot)driver;  // upcasting  casting of interface
        
           // step3:
            File Source =tss.getScreenshotAs(OutputType.FILE);   
       
           // File Destination=new File("C:\\Users\\HP\\eclipse-workspace\\Selenium1\\SreenShots1\\Finology.png");
            
            File Destination=new File(System.getProperty("user.dir")+"\\SreenShots1\\Finology123.png");
       
       
           FileHandler.copy(Source, Destination);
           
       
           System.out.println("Sceenshots captured");
       
       
   
       
       
       
	}

}

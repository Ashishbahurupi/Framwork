package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
  public WebDriver driver;
  public Loginpage ip;
    
    
	@FindBy(id="txtUsername")
	private WebElement usename;
	
	@FindBy(xpath="//*[@id='txtPassword']")
	private WebElement password;
	
	@FindBy(xpath="//*[@class='button']")
    private WebElement button;	
    
    public Loginpage(WebDriver driver) {
    	
    PageFactory.initElements(driver,this );
    
    }
    public void getusernameTab() {
    	
    	 usename.sendKeys("Admin");
    	
     }
    public void getPasswordTab() {
    	
    	password.sendKeys("admin");
  
}
    public void getbutton() {
    	
    	button.click();
    	
}


	
}

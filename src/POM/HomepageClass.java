package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//@ change
public class HomepageClass {

    @FindBy(id="//*[@id='welcome']") private WebElement link;
	
	@FindBy(xpath="//*[text()='Logout']") private WebElement logout;
	
	public HomepageClass (WebDriver driver ) {
		
		PageFactory.initElements(driver, this);	
	}
		
	
	    public void getprofilelink() {
		
		link.click();	
		
	}
		public void getlogoutlink() {
			
		logout.click();
	}
		
}
  

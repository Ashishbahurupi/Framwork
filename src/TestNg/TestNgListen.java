package TestNg;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestNgListen {
	
	WebDriver driver;
	@BeforeClass
	
	public void init() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("  https://www.makemytrip.com/flights/");
	}

	@Test()
	
	public void GetTital() {
		
		
		String actualTitle=driver.getTitle();
		
		String expectedTitle=" MakeMyTrip";
		
		System.out.println(actualTitle);
		
		Assert.assertEquals(actualTitle,expectedTitle );
		
	}
	
	@Test(dependsOnMethods="GetTital")
	
	public void getIndex() {
		
		
		System.out.println("getIndex");
	}
	
	@Test
	
	public void Login() {
		
		
		System.out.println("login");
	
	}
}

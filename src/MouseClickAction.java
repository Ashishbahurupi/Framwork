import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseClickAction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\selenium Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(" ");
		
		driver.manage().window().maximize();
		
		
		
		

	}

}

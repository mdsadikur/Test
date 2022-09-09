package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	public static WebDriver driver = null;
	
	@BeforeSuite
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://frontend.nopcommerce.com/");
		//open new window and switch to new window
		driver.switchTo().newWindow(WindowType.TAB);
		//open new homepage
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}

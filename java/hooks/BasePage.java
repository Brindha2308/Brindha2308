package hooks;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage extends AbstractTestNGCucumberTests {
	
	
	 private static final ThreadLocal<ChromeDriver> tlDriver=new
	 ThreadLocal<ChromeDriver>();
	 
	 public void setDriver(ChromeDriver driver) { 
		 tlDriver.set(driver); }
	 
	 public ChromeDriver getDriver() { 
		 return tlDriver.get(); }
	
	
	//public  static ChromeDriver driver;
	
	@BeforeMethod
	public void launch() {
		
		WebDriverManager.chromedriver().setup();
		setDriver(new ChromeDriver());
		getDriver().get("http://leaftaps.com/opentaps");
		getDriver().manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().close();
	}

}

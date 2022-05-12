import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTestDemo {
	
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	
	@Test
	public void navigationTest() throws Exception {
		
		
		MyScreenRecorder.startRecording("navigationTest");
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.facebook.com/");
		
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		
		
		MyScreenRecorder.stopRecording();
		
	}
	
	
	@Test
	public void navigation_FeatureTest() throws Exception {
		
		
		MyScreenRecorder.startRecording("navigation_FeatureTest");
		driver.get("https://www.amazon.com");
		driver.navigate().to("https://www.rediff.com");
		
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		
		
		MyScreenRecorder.stopRecording();
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

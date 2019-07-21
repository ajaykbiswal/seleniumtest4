package handlersPlus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossbrowserTest {
	
	DesiredCapabilities ieCapabilities;
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void startBrowser(String brName){
		
		if(brName.equalsIgnoreCase("firefox"))
		{
			
			driver=new FirefoxDriver();
			
		}
		else if(brName.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
		}
		else if (brName.equalsIgnoreCase("IE"))
		{
			ieCapabilities= DesiredCapabilities.internetExplorer();
			ieCapabilities.setCapability("ignoreProtectedModeSettings" , true);
			ieCapabilities.setCapability("ignoreZoomSetting" , true);
			System.setProperty("webdriver.ie.driver", "D:\\IEDriver\\Old_Driver\\IEDriverServer.exe");
			
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/SignUp?");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}

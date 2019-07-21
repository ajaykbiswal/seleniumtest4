package Handler;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void startBrowser(String browserName){
		
		if(browserName.equalsIgnoreCase("Firefox"))
		{
			
			driver=new FirefoxDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("chrome"))
		{   
			System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("IE"))
		{   
			System.setProperty("webdriver.ie.driver", "D:\\IEDriver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			
		}
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	    driver.get("https://www.facebook.com/");
	    
	    System.out.println(driver.getTitle());
		
		
	}
	

}

package Handler;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	public static WebDriver startbrowser(String brName,String URL){
		
		if(brName.equalsIgnoreCase("firefox"))
		{
			
			driver=new FirefoxDriver();
		}
		
		else if(brName.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		
		else if(brName.equalsIgnoreCase("IE"))
		{
					
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);
		return driver;
		
	}

}

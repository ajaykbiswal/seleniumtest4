package Handler;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class IETestCase {
	static DesiredCapabilities ieCapabilities;
	@Test
	public static void IETESTCASE() {
		
//		DesiredCapabilities ds=DesiredCapabilities.chrome();
//		ds.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		
		ieCapabilities= DesiredCapabilities.internetExplorer();
		ieCapabilities.setCapability("ignoreProtectedModeSettings" , true);
		ieCapabilities.setCapability("ignoreZoomSetting" , true);
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\ajayb4\\Desktop\\Selenium1\\IEDriverServer.exe");
		
		WebDriver driver=new InternetExplorerDriver(ieCapabilities);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://www.ksrtc.in/oprs-web/");

	}

}

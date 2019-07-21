package ListenerDemo;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(ListenerDemo.ListenerTestNG.class)
public class CallListenerTest {
	
	@Test(priority=0)
	public void VerifyTitle()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

	@Test(priority=1)
	public void TitleMatched()
	{
		
		System.out.println("Title Matched");
		Assert.assertTrue(false);
		System.out.println("Title Not Matched");
	}
	
	
}

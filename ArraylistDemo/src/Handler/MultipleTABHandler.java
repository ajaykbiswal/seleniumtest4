package Handler;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleTABHandler {

	public static void main(String[] args) throws Exception {
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		
		String parent=driver.getWindowHandle();
		
		
		Set<String> allwnd=driver.getWindowHandles();
		
		ArrayList<String> tab=new ArrayList<>(allwnd);
		
		driver.switchTo().window(tab.get(2)).close();
		
		driver.switchTo().window(tab.get(1)).close();
		
		driver.switchTo().window(parent);
		
		System.out.println(driver.getTitle());
		
	}
}

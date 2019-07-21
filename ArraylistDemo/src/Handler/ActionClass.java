package Handler;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ActionClass {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
//		driver.navigate().to("https://www.amazon.com/");
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File(""));
//	
//
//	}
//     
//	public void clickOn(WebDriver driver,WebElement locator,long timeout){
//		
//		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
//		locator.click();
//	}
		
		String parent=driver.getWindowHandle();
	    Set<String> tabs=driver.getWindowHandles();
	    ArrayList<String> allTabs=new ArrayList<String>(tabs);
	    driver.switchTo().window(allTabs.get(2)).close();
		
	    driver.switchTo().window(parent);
	    
	    System.out.println(driver.getTitle());
	    
		
		driver.findElement(By.xpath("//input[@value='Register with us']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@title='I am a Fresher']")).click();
}

	
}
package handlersPlus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandler {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://www.ksrtc.in/oprs-web/");
		
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		
		driver.switchTo().alert().accept();
		
		driver.switchTo().defaultContent();
		
		if (!driver.findElement(By.xpath("//input[@id='singleLady']")).isSelected()){
			
	
			driver.findElement(By.xpath("//input[@id='singleLady']")).click();;
			 
		}
		
		

	}

}

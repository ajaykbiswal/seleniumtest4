package Handler;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDD {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/SignUp?");

		driver.findElement(By.xpath("//div[@id=':i' and contains(text(),'India')]")).click();
		
		driver.findElement(By.xpath("//div[ contains(text(),'Antigua')]")).click();
		
//		List<WebElement> dd=driver.findElements(By.xpath("//div[contains(@class,'menuitem-content')]"));
//		
//		for(WebElement ele:dd){
//			
////			System.out.println(ele.getAttribute("innerHTML"));
//			
//			System.out.println(ele.getText());
//		}
//		
		
	}

}



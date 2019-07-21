package Handler;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopupWindowHandler {

	public static void main(String[] args) throws Exception 
	
	{   
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//div[@id='signin-block']//i[contains(@id,'profile')]")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(arg0)
		driver.switchTo().alert().authenticateUsing(new UserAndPassword);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//ul[@class='config-list']/li[text()='Sign In/Sign Up']")).click();
		
		Thread.sleep(1000);
		
		int d=driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(d);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		
		
		driver.findElement(By.xpath("//button[text()='signup with email']")).click();
		
		System.out.println(driver.getTitle());
		
		List<WebElement> olist=driver.findElements(By.xpath("//div[@class='modalCloseSmall']/i[@class='icon-close']"));
		System.out.println(olist.size());
		for(int i=0;i<olist.size();i++){
			
			int x=olist.get(i).getLocation().getX();
			
			if(x!=0)
			{
				
				olist.get(i).click();
			}
				
		}
				
				
		
//        Actions action=new Actions(driver);
//        
//        action.moveToElement(ele).click().build().perform();
//		
//		WebDriverWait wait=new WebDriverWait(driver,20);
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'Small') and @title='close']"))).click();
		

		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//label[text()='FROM']")).sendKeys("bbsr");
		
		
		


	}

}

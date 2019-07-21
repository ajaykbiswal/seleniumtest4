package Handler;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandler {

	public static void main(String[] args) throws Exception {
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
//		
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		
//		driver.get("http://www.ksrtc.in/oprs-web/");
//		
//		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("dff");
//		
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//input[@type='button' and @id='searchBtn']")).click();
//		
//		Thread.sleep(1000);
//		
//		String s=driver.switchTo().alert().getText();//To extract alert message
//		
//		System.out.println(s);
//		
//		driver.switchTo().alert().accept();//To accept/ok the Alert message eg.OK button
//		
//		//driver.switchTo().alert().dismiss();//To cancel/dismiss the Alert message 
//		
//		
//		
//		//driver.switchTo().alert().sendKeys("Enter some text");//If u want enter some input on alert message.
//		
//		driver.findElement(By.xpath("//input[@id='toPlaceName']")).sendKeys("sdfff");
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//input[@name='fileupload']")).sendKeys("C:\\Users\\ajayb4\\Downloads\\PDF\\GMC Benefits and FAQ-2017- Offshore.pdf");
//		Alert alert=driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
//		//alert.dismiss();
		
		
	}

}

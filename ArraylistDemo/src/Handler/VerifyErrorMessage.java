package Handler;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyErrorMessage {

	@Test
	public  void VerifyTitle() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/signin");
		
		
		String actual_value=driver.findElement(By.xpath("//input[@id='identifierId']")).getAttribute("innerHTML");
		String actual_values=driver.findElement(By.xpath("//div[@jsname='bCkDte']")).getAttribute("innerHTML");
		
		
		System.out.println("InnerHTML is "+actual_values);
		
		String expected_Value="Forgot email? ";
		
		Assert.assertEquals(actual_value, expected_Value);
		
		Assert.assertTrue(actual_value.contains(expected_Value), "Actual Title not matched with expected");
		
		System.out.println("Title matched Sucessfully...");
		
		
	}

}

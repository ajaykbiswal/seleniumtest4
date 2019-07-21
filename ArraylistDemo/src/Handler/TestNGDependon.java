package Handler;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGDependon {
	
	@BeforeClass
	public void startBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		
	}
	
	WebDriver driver;
	@Test
	public void startApp()
	{
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		
		String currentUrl=driver.getCurrentUrl();
		
		Assert.assertTrue(currentUrl.contains("orangehrmlive"));
		
		System.out.println("*************Application Started*********");
		
	}

	@Test(dependsOnMethods="startApp")
	public void LoginApp()
	{
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("aaya");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).submit();
		
		boolean status=driver.findElement(By.xpath("//*[@id='menu_dashboard_index']/b")).isDisplayed();
		
		Assert.assertTrue(status);
		
		System.out.println("*************Application LoggedIn*********");
	}
	
	@Test(dependsOnMethods="LoginApp")
	public void LogoutApp() throws Exception
	{
		driver.findElement(By.xpath("//a[text()='Welcome Admin']")).click();
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		
		boolean status=driver.findElement(By.xpath("//div[text()='LOGIN Panel']")).isDisplayed();
		Assert.assertTrue(status);
	
		System.out.println("*************Application Logout*********");
		
	}
	
	@AfterClass
	public void TearDown() 
	{   
		
		driver.quit();
		
	}
	
}

package com.FreeCrm.Page;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLoginpage {
	
	
	@Test
	public void VerifyLoginTest(){
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
		
		LoginPage login=new LoginPage(driver);
		login.LogintoCRM("ajayk123", "ajayk123");
		driver.switchTo().frame(1);
		WebElement ele=driver.findElement(By.xpath("//ul[@class='mlddm']//li/a[text()='Home']"));
		Assert.assertTrue(ele.getAttribute("title").contains("Home"));
		driver.quit();
			
		
	}

}

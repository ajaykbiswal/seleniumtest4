package com.FreeCrm.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Handler.BrowserFactory;

public class VerifyLoginPage {
	
	@Test
	public void VerifyLoginTest(){
		
		WebDriver driver=BrowserFactory.startbrowser("chrome", "https://www.freecrm.com/index.html");
		
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
		
		login.Logintocrmpage("ajayk123", "ajayk123");
		driver.switchTo().frame(1);
		WebElement ele=driver.findElement(By.xpath("//ul[@class='mlddm']//li/a[text()='Home']"));
		Assert.assertTrue(ele.isDisplayed());
		driver.quit();
		
	}

}

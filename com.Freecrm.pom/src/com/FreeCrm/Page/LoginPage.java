package com.FreeCrm.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	By userName=By.name("username");
	By Password=By.name("password");
	By login_button=By.xpath("//input[@value='Login']");
	
	
	public void LogintoCRM(String user_id,String pass){
		
		driver.findElement(userName).sendKeys(user_id);
		driver.findElement(Password).sendKeys(pass);
		driver.findElement(login_button).submit();
	}
	
	
	

}

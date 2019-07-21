package com.FreeCrm.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver ldriver){
		
		this.driver=ldriver;
			
	}
	
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(how=How.NAME,using="password") 
	WebElement Password;
	
	@FindBy(how=How.XPATH,using="//input[@value='Login']") 
	WebElement submit_btn;
	
	public void Logintocrmpage(String user_ID,String user_Pass){
		
		userName.sendKeys(user_ID);
		Password.sendKeys(user_Pass);
		submit_btn.submit();
	}
	
	
	
	
	
	
}

package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinationDemo {
	WebDriver driver;
	@Given("^Open Chrome and start application$")
	public void open_Chrome_and_start_application() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("");
		
	   
	}

	@When("^Enter valid username and valid password$")
	public void enter_valid_username_and_valid_password() throws Throwable {
		
		driver.findElement(By.xpath("")).sendKeys("");
		driver.findElement(By.xpath("")).sendKeys("");
		
	   
	}

	@Then("^user should be able to login into application sucessfully$")
	public void user_should_be_able_to_login_into_application_sucessfully() throws Throwable {
		
		driver.findElement(By.id("")).click();
	    
	}

}

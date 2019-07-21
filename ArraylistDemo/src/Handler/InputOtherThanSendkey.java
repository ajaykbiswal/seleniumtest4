package Handler;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputOtherThanSendkey {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
		//To type in Selenium without using sendKeys() method
		
		((JavascriptExecutor)driver).executeScript("document.getElementById('lst-ib').value=selenium;");
		
		// To uncheck/Check checkbox in Selenium if checkbox is disable
		
		((JavascriptExecutor)driver).executeScript("document.getElementById('sing').checked=true;");
		
		((JavascriptExecutor)driver).executeScript("document.getElementById('sing').checked=false;");
		
		//click in Selenium if button or radio button is disable
		((JavascriptExecutor)driver).executeScript("document.getElementById('java').click();");
		
		
	}

	}
	



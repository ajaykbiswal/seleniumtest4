package Handler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CroseBrowserTesting {
	 WebDriver driver;
	public  void startBrowser(String brName){
		
		if(brName.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
		}
		else if(brName.equalsIgnoreCase("firfox")){
			System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		}
	}
	
	
	public static void main(String args[]){
		CroseBrowserTesting browser=new CroseBrowserTesting();
		browser.startBrowser("chrome");
	}
	

}

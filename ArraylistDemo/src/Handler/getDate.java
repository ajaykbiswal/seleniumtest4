package Handler;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class getDate {

	public static void main(String[] args) {
		
	
//	WebDriver driver=new ChromeDriver();
//	Dimension d=new Dimension(200,400);
//	driver.manage().window().setSize(d);
//	
//	JavascriptExecutor j=(JavascriptExecutor)driver;
//	j.executeScript("window.resizeTo(200,400);");
		
	DateFormat df=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	Date ds=new Date();
	
	System.out.println(df.format(ds));
	
	
	
	
		
		
		
	}

}

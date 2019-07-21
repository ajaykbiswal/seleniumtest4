package handlersPlus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
		
		WebElement ele=driver.findElement(By.xpath("//div[@id='gs_st0']/a"));
		
		Actions builder=new Actions(driver);
		
		builder.moveToElement(ele).perform();
		
		String tooltip_msg=ele.getAttribute("title");
		String tooltip_msgs=ele.getAttribute("aria-label");
		
		System.out.println(tooltip_msgs);
		
		 System.out.println("Tooltip/ Help message is "+tooltip_msg);
		
		
		
		
	}

}

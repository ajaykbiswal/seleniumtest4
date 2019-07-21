package Handler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
       WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		
       
	   List<WebElement> dd=new Select(ele).getOptions();
	   ArrayList<WebElement> list=new ArrayList<>(dd);
	   System.out.println(list.get(2).getText());
	   
	   
		
        
	}

}

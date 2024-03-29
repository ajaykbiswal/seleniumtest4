package Handler;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> olist=driver.findElements(By.xpath("//input[@id='female']"));
		
		System.out.println(olist.size());
		
		for(int i=0;i<olist.size();i++){
			
			int x=olist.get(i).getLocation().getX();
			
			if(x!=0){
				
				olist.get(i).click();
				break;
			}
			
		}

	}

}

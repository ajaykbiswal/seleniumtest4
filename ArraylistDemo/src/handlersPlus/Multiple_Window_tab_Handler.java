package handlersPlus;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_Window_tab_Handler {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		
		String parentwnd=driver.getWindowHandle();
		
		Set<String>olist=driver.getWindowHandles();
		
		ArrayList<String> newlist=new ArrayList<>(olist);
		//1st way
		
		driver.switchTo().window(newlist.get(1)).close();
		
		driver.switchTo().window(newlist.get(2)).close();
		// 2nd Way
//		for(String child:newlist){
//			
//			if(!parentwnd.equalsIgnoreCase(child))
//			{
//			   driver.switchTo().window(child);
//			   
//			   System.out.println("Child windows are:"+driver.getTitle());
//			   
//			   driver.close();
//			   
//				
//			}
//		}
		
		driver.switchTo().window(parentwnd);
		
		WebElement ele=driver.findElement(By.xpath("//span[@class='searchJob']"));
		
		Actions builder=new Actions(driver);
		
		builder.moveToElement(ele).click(ele).build().perform();
		
	    WebElement tooltip=driver.findElement(By.xpath("//*[@id='skill']//input"));
	    builder.contextClick(tooltip).perform();
	    
	    System.out.println(tooltip.getAttribute("placeholder"));
	    System.out.println(tooltip.getText());
		
	    		
		
		
		
		
		

	}

}

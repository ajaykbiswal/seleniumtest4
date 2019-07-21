

package handlersPlus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassHandler {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		WebElement drag=driver.findElement(By.xpath("//*[@id='draggable']"));
		Thread.sleep(4000);
		WebElement drop=driver.findElement(By.xpath("//*[@id='droppable']"));	
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
//		action.doubleClick(drag);
//		action.contextClick(drag);
//		//resize
//		action.clickAndHold(drag).moveByOffset(20, 30).release(drag).build().perform();
////		action.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
//			
////		action.dragAndDrop(drag, drop).perform();
		

	}

}

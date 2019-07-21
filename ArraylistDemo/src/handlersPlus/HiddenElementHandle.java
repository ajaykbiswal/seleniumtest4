package handlersPlus;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElementHandle {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		WebElement ele=driver.findElement(By.xpath("//input[@id='male']"));
//		List<WebElement> olist=driver.findElements(By.xpath("//input[@id='male']"));
//		
//		for(int i=0;i<olist.size();i++){
//			
//			int x=olist.get(i).getLocation().getX();
//			System.out.println(x);
//			if(x!=0){
//				
//				olist.get(i).click();
//				break;
//			}
//		}
//		
		
		String jsr = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";
		((JavascriptExecutor)driver).executeScript(jsr, ele);
		ele.click();
	

	}

}

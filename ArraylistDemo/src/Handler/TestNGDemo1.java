package Handler;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo1 {
	
	@Test()
	public void startApplication()
	{
		
		System.out.println("login to Aplication");
		
		Assert.assertEquals(12, 13);
		
		System.out.println("hello application");
	}
	
	@Test(dependsOnMethods="startApplication")
	public void inputtestdata()
	{
		
		System.out.println("Test data added in to textbox");
	}
	@Test(dependsOnMethods="inputtestdata")
	public void logout()
	{
		
		System.out.println("application logout sucessfully");
	}
	
}

package Handler;

import org.testng.annotations.Test;

public class TestNGDemo {
	
	@Test(priority=1,description="Login To application")
	public void startApplication()
	{
		
		System.out.println("login to Aplication");
	}
	
	@Test(priority=2,description="TestData added to application")
	public void inputtestdata()
	{
		
		System.out.println("Test data added in to textbox");
	}
	@Test(priority=-3,description="logout form application")
	public void logout()
	{
		
		System.out.println("application logout sucessfully");
	}
	
}

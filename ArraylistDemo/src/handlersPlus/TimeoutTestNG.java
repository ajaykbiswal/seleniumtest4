package handlersPlus;

import org.testng.annotations.Test;

public class TimeoutTestNG {
	
	@Test
	public void testcase1()
	{
		System.out.println("Im ready to execute");

		
	}

	
	@Test(timeOut=10000)
	public void testcase2() throws Exception
	{  
		Thread.sleep(30000);
//	Thread.sleep(3000);
		System.out.println("Im ready to Again execute");

		
	}
}

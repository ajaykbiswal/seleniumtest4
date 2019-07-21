package handlersPlus;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipExceptionExample {
	
	@Test(enabled=false)
	public void testcase1(){
		
		System.out.println("I'm Not Ready, please don't execute me");

	}

	@Test
	public void testcase2(){
		
		System.out.println("Im in skip exception");
	    throw new SkipException("Skipping this exception");
	  

	}
	
	
	@Test
	public void testcase3(){
			
		System.out.println("Im in Conditional Skip");
        
	    throw new SkipException("Skipping this exception");

	}
}

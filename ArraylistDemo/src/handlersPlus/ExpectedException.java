package handlersPlus;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExpectedException {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void testcase1(){
		
		int x=1/0;
		
	}
	
	public void testcase2(){
		
		int x=1/0;
		
	}
	
	
	@Test(dataProvider="testdata",expectedExceptions=ArrayIndexOutOfBoundsException.class)
	public void testcase3(String a,String b)
	{
		System.out.println("The value of A is "+a +"The value of B is "+ b);
	
	    
	}
	
	
	@DataProvider(name="testdata")
	public Object[][] returndata(){
		
		Object[][] data=new Object[3][2];
		
		
		
		data[0][0]="admin";
		data[0][1]="demo1";
		data[1][0]="admin";
		data[1][1]="demo123";
		data[2][0]="admin";
		data[2][1]="demo1234";
								
								
		return data;
		
	}
	
	
}

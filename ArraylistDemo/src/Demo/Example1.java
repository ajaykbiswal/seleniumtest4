package Demo;

public class Example1 {
	
	public void display1(){
		
		System.out.println("Display1 Method");
		
	}
}
abstract class Example2{
	
	abstract void display2();
}
	
abstract class Example3 extends Example1
{
	 abstract void display3();
	
}

class Example4 extends Example3{

	@Override
	void display3() {
		System.out.println("Display3 Method");
		
	}
	
}
 
	


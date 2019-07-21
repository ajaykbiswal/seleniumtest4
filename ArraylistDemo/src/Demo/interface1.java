package Demo;

interface interface1 
{
  public void display1();
	
	
}

interface interface2
{
	
	public void display2();
	
}

interface interface3 extends interface1,interface2
{
	void display3();
		
	
}

class interface4 implements interface3{

	
	public void display5(){
		System.out.println("Display3 method");
		
	}
	@Override
	public void display1() {
		System.out.println("Display1 method");
		
	}

	@Override
	public void display2() {
		
		System.out.println("Display2 method");
	}
	@Override
	public void display3() {
		// TODO Auto-generated method stub
		
	}

	
	
}
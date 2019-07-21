package ArrayDemo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistTest1 {

	public static void main(String[] args) {
		
		ArrayList obj1=new ArrayList();
		obj1.add("38884322");
		obj1.add("msh");
		obj1.add("256.88");
		obj1.add("Selenium");
		obj1.add("Selenium");
		
		Iterator itr=obj1.iterator();
		
		while(itr.hasNext()){
			
			Object val=itr.next();
			System.out.println("Value is "+val);
		}
		
		
	}	
}

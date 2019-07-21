package ArrayDemo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericArraylist {

	public static void main(String[] args) {
		
//	Collection<String> obj1=new ArrayList<String>();
	List<String> obj1=new ArrayList<String>();
//	ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("AAJAY");		
		obj1.add("Selenium");
		obj1.add("Selenium");
		
		for(Object str:obj1){
			
			System.out.println("Arraylists of value is:"+str);
			
			
		}
		
	}	
}

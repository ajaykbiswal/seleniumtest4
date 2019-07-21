package ArrayDemo1;

import java.util.ArrayList;
import java.util.List;

public class ItratorArraylistDemo {

	public static void main(String[] args) {
		
		ArrayList obj1=new ArrayList();
		obj1.add("38884322");
		obj1.add("msh");
		obj1.add("256.88");
		obj1.add("Selenium");
		obj1.add("Selenium");
		
		for(Object str:obj1){
			
			System.out.println("Arraylists of value is:"+str);
			
			
		}
		
	}	
}

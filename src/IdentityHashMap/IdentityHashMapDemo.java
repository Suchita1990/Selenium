package IdentityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) 
	{     
		/**In normal HashMap JVM use ".equals()" method is used to identify duplicates.
		 * 
		 */
		   //HashMap=new HashMap();//o/p:{10=Raj}
		IdentityHashMap m=new IdentityHashMap();//o/p:{10=Pawan,10=Raj}
		    Integer i1=new Integer(10);
		    Integer i2=new Integer(10);
		
		     m.put(i1,"Pawan");
		     m.put(i2,"Raj");
		     
		    System.out.println(m);//
	}

}

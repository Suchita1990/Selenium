package HashMapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo 
{

	public static void main(String[] args)
	{
		HashMap hs=new HashMap();
		hs.put(1,"Hello");
		hs.put("a","Testing");
		hs.put(3,"Shastra");
	 System.out.println("Hashmap :"+hs+"\n");
	 
	 LinkedHashMap map=new LinkedHashMap();
	    map.put("Java","Slenium");
	    map.put("Java","FullStack");
	    map.put(null, null);
	    map.put(null,"new value");
	    map.put("2",null);
	 System.out.println("LinkedHashMap is:"+map+"\n");
	 
	/* =======================================================*/
	    // Constructor of LinkedHashMap
	 
	    LinkedHashMap hs0=new LinkedHashMap();
	    System.out.println("LinkedHashMap with initial capacity 16:"+hs0+"\n");
	    
	   LinkedHashMap hs1=new LinkedHashMap(2);
	     hs1.put("Hi","Suchita");
	     hs1.put("Hello","Sneha");
	     hs1.put(1,"Avi");
	     hs1.put(2,"Minal");
	    System.out.println("LinkedHashMap with Specified Initial Capacity:"+hs1+"\n");
	    
	    LinkedHashMap hs2=new LinkedHashMap(3, 0.80f);
	    	 hs2.put(1,"A");
	    	 hs2.put(2,"B");
	    	 hs2.put(3,"c");
	    	 hs2.put(4,"D");
	    	 hs2.put(5,"E");
	    	 hs2.put(6,"F");
	    	 hs2.put(7,"G");
	    	 hs2.put(8,"H");
	    	 hs2.put(9,"I");
	    	 hs2.put(10,"J");
	    	 hs2.put(11,"K");
	    	 hs2.put(12,"L");
	    	 hs2.put(13,"M");
	    	 hs2.put(14,"N");
	    	 hs2.put(15,"O");
	    	 hs2.put(16,"P");
	    	 hs2.put(17,"Q");
	    	 hs2.put(18,"R");
	    	 hs2.put(19, "S");
	    	 hs2.put(20,"T");
	    System.out.println("LinkedHashMap is:"+hs2+"\n");
	    
		LinkedHashMap hs3=new LinkedHashMap(hs);
		System.out.println("LinkedHashMap(map hs) Constructor:"+hs3+"\n");
	 
	}

}

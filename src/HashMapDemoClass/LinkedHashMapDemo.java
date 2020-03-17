package HashMapDemoClass;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) 
	{
	  LinkedHashMap m=new LinkedHashMap();
        m.put("chiranjeevi",700);
        m.put("balaiah",800);
        m.put("venkatesh",200);
        m.put("nagarjuna",500);
        System.out.println("LinkedHashMap Is: "+m);
        
        System.out.println(m.put("chiranjeevi",1000));//old value replace with new value and return old value
        
        Set s=m.keySet();//only key print
        System.out.println(s);
        
        Collection c=m.values();// only values print 
        System.out.println(c);
        
        Set s1=m.entrySet();//print key-value
        System.out.println(s1);
        
        Iterator itr=s1.iterator();
        while(itr.hasNext())
        {
      	  Map.Entry m1=(Map.Entry)itr.next();
      	  System.out.println(m1.getKey()+"___"+m1.getValue());
      	  if(m1.getKey().equals("nagarjuna"))
      	  {
      		  m1.setValue(10000);
      	  }
      	  System.out.println(m);
        }
	}

}



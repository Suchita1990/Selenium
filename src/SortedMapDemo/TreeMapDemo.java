package SortedMapDemo;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args)
	{
	  TreeMap t=new TreeMap();
        t.put(2,"A");
        t.put(3,"B");
        t.put(6,"C");
        t.put(1,"D");
        t.put(4,"E");
        t.put(5,"F");
        System.out.println("Treemap is:"+t);//Natural sorting order
        System.out.println("HeadMap:"+t.headMap(3));//less than(check on only key not value)
        System.out.println("headmap is:"+t.headMap(1)); 
        System.out.println("tailmap:"+t.tailMap(3));//greater than or equal to
       // Integer(3).equals("A"); //class cast exception
        System.out.println("subMap:"+t.subMap(1,5));//1 cha tailmap 5 cha headmap
	}


}

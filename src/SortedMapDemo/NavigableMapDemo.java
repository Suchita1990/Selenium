package SortedMapDemo;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args)
	{
	  NavigableMap t=new TreeMap();
	   NavigableSet s;
	    t.put(12,"A");
	    t.put(33,"B");
	    t.put(47,"C");
	    t.put(72,"D");
	    t.put(25,"E");
	    t.put(32,"F");
	    System.out.println(t);
	    System.out.println(t.higherEntry(5));//entry asel tr with key o/p yete
	    System.out.println(t.higherKey(6));//only key print
	    System.out.println(t.lowerKey(5));
	    System.out.println(t.lowerEntry(37));
	    System.out.println(t.floorEntry(4));
	    System.out.println(t.floorKey(4));
	    System.out.println(t.ceilingKey(6));
	 }

}

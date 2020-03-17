import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo
{
  public static void main(String[] args) throws InterruptedException
	{
		WeakHashMap m=new WeakHashMap();
		   Temp t=new Temp();
		    m.put(t,"Duraga");
		   System.out.println(m);
		    t=null;
/**lang.System.gc():
 *           method runs the garbage collector. Calling this suggests that the Java Virtual Machine expend effort toward
 *           recycling unused objects in order to make the memory they currently occupy available for quick reuse		    
 */
		    System.gc();
/**Thread.sleep():
 *          method can be used to pause the execution of current thread for specified time in milliseconds. 
		    The argument value for milliseconds can’t be negative, else it throws IllegalArgumentException.*/		    
		    Thread.sleep(5000);
		    System.out.println(m);
	}
}
   class Temp
     {
/**toString():
 *           method simply returns the current string without any changes,
 *           there is no need to call the string explicitly, it is usually called implicitly.*/
    	@Override
    	public String toString()
    	{
    		return "temp";
    	} 
    	
/**finalize():
           Called by the garbage collector on an object when garbage collection determines that 
           there are no more references to the object. A subclass overrides the finalize method
           to dispose of system resources or to perform other cleanup*/
         @Override
       public void finalize()
         {
    	   System.out.println("Finalize Method Called");
         }
}

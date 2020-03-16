package Suchita.Add;


import org.testng.annotations.Test;

public class Addition
{
@Test
 public void m1()
{
	int i=10;
 System.out.println("I am in first test case");
 System.out.println(i);
}
 public void add(int a,int b) 
 {
	 int c=a+b;
    System.out.println(c);
}
@Test
public void add(int a,int b,int c)
{
   int x=a+b+c;
   System.out.println(x);
}
@Test
public void add(int a,int b,int c,int d)
{
  int y=a+b+c+d;
  System.out.println(y);
}

}

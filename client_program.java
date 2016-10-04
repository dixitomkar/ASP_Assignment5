package week5_assignment;

import java.util.Map;
import java.util.Scanner;

public class client_program 
{
	public static void main(String[] args)
	{
		Priority object1 = new Priority(); 
		Priority object2 =  new Priority() ; 
		System.out.print("Enter the number of Key Value pairs: "); 
		Scanner sc = new Scanner(System.in);
	    int no = sc.nextInt();
	    for(int i=0;i<no;i++)
	    {
	    	System.out.print("Enter the String: ");
	    	String temp1=sc.next(); 
	    	System.out.print("Enter Priority ");
	    	int p1=sc.nextInt(); 
	    	object1.enqueue(temp1,p1);
	    }
	    System.out.println("Dequeing highest priority String");
	    object1.dequeue();
	    System.out.println("Comparison");
	   if(object1.equals(object2))
	   {
		   System.out.println("Both objects are equal");
	   }
	   else
	   {
		   System.out.println("Not equal");
	   }
	   System.out.println("Cloning");
	   object2=object1.clone();
	   
	   System.out.println("To String");
	   String[] arr1=object2.toString(1);
	   for(int k=0;k<arr1.length;k++)
	   {
		   System.out.println(arr1[k]);
	   }
	   System.out.println("Return HasCode");
	   Map<String,Integer> op=object2.hashCode(1); 
	   System.out.println(op);
	   
	   
	}
}

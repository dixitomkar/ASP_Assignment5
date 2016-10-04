package week5_assignment;


import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Priority 
{
    public Map<String, Integer> priority_list = new HashMap<>();
    
    public void enqueue(String task_name, int priority)
    {
    	priority_list.put(task_name, priority);
    	System.out.println("Entered task " + task_name + " with priority " + priority);
    }
    
    public String dequeue()
    {
    	int temp_pri = 0;
    	String temp_task = null;
    	Set set = priority_list.entrySet();
    	Iterator it = set.iterator();
    	while(it.hasNext())
    	{
    	    Map.Entry mentry = (Map.Entry)it.next();
    	    if ((int) mentry.getValue() > temp_pri )
    	    {	
    	    	temp_pri = (int)mentry.getValue();
    	    	temp_task = (String) mentry.getKey();
            }
    	}
    	System.out.println("Task to be dequeued: " + temp_task + " with priority: " + temp_pri);
    	priority_list.remove(temp_task);
		return temp_task;
    }
    public boolean equals(Priority p1)
    {
    	if(this.priority_list.equals(p1.priority_list))
    		return false;
    	else
    		return true;
    }
    public Priority clone()
    {
    	return this; 
    }
    
    public  String[] toString(int a)
    {
    	String [] ans=new String[priority_list.size()];
    	Set set = priority_list.entrySet();
    	Iterator it = set.iterator();
    	int i=0;
    	while(it.hasNext())
    	{
    	    Map.Entry mentry = (Map.Entry)it.next();
    	    ans[i]=(String) mentry.getKey();
    	    i++; 
        }
    	return ans; 
    }
    
    public Map hashCode(int a)
    {
    	return this.priority_list; 
    }
}
    
    
    




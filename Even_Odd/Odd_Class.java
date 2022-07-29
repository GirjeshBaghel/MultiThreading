package Threads;
public class Odd_Class extends Even_Class {
	
	public void run() // run method is calling by the another
	{
		accept(); // accept  method calls  to the another class 
		for(i=s; i<=l; i++)
	    	{			
	    	if(i%2 != 0) // logic of odd no 
	    	{
	    		System.out.println(i+" Odd"); // printing a odd no
	    	}
	    	
	    }
	}
}

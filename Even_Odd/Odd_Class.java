package Threads;

public class Odd_Class extends Even_Class {
	
	public void run()
	{
		accept();
		for(i=s; i<=l; i++)
	    {			
	    	if(i%2 != 0)
	    	{
	    		System.out.println(i+" Odd");
	    	}
	    	
	    }
	}

}

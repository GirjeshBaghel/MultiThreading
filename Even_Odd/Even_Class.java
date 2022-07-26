package Threads;

import java.util.Scanner;

public class Even_Class  extends Thread {

	Scanner sc = new Scanner(System.in);
	int s,l,i;
	public void accept()
	{
		System.out.println("Enter the Start Value : ");
	    s = sc.nextInt();
	    System.out.println("Enter the Last Value : ");
	    l = sc.nextInt();
	}
	public void run()
	{
		accept();
	    for(i=s; i<=l; i++)
	    {
	    	if(i%2 == 0)
	    	{
	    		System.out.println(i +" Even");
	    	}
	    	
	    }
	}
}

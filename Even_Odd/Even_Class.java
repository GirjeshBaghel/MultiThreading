package Threads;
import java.util.Scanner;

public class Even_Class  extends Thread {
	// global variable
	Scanner sc = new Scanner(System.in);
	int s,l,i;
	public void accept() // accept method calling by the another class 
	{
            System.out.println("Enter the Start Value : "); // taking a first value from the user
	    s = sc.nextInt();
	    System.out.println("Enter the Last Value : ");  // taking a last value from the user
	    l = sc.nextInt();
	}
	public void run() // run method calling by the another class
	{
	    accept();
	    for(i=s; i<=l; i++)
	    {
	    	if(i%2 == 0) // checking a even condition
	    	{
	    		System.out.println(i +" Even");
	    	}
	    	
	    }
	}
}

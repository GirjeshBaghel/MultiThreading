package Threads;
import java.util.Scanner;

public class Even_Odd  extends Thread{
	// global variable
	Scanner sc = new Scanner(System.in);
	int s,l,i;
				
		public void run() // run method calling by the main method
		{		
		    System.out.print("Enter the Start Value : "); // taking a start value from user
		    s = sc.nextInt();
		    System.out.print("Enter the Last Value : "); // taking a last value from user
		    l = sc.nextInt();
		    
		    System.out.println("Even no are : "); //printing a even no
		    for(i=s; i<=l; i++)
		    {
		    	try {
					Thread.sleep(2000); // sleeping a thread
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	if(i%2 == 0) // even no printing
		    	{
		    		System.out.print(i);
		    	}
		    	
		    }
		    System.out.println("\nOdd no are : "); // odd no printing
		    for(i=s; i<=l; i++)
		    {
		    	if( %2 != 0) // checking a odd condition
		    	{
		    		System.out.print(i);
		    	}
		    	
		    }
			
		}
		public static void main(String[] args) // main method
		{
			Even_Odd ob = new Even_Odd();
			Even_Odd ob1 = new Even_Odd();
			ob.start(); // run method calling
			ob1.start(); // run method calling
		}
}

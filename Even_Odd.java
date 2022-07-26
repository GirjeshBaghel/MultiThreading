package Threads;

import java.util.Scanner;

public class Even_Odd  extends Thread{
	Scanner sc = new Scanner(System.in);
	int s,l,i;
		public static void main(String[] args)
		{
			Even_Odd ob = new Even_Odd();
			ob.start();
		}
		
		public void run()
		{
			
			System.out.print("Enter the Start Value : ");
		    s = sc.nextInt();
		    System.out.print("Enter the Last Value : ");
		    l = sc.nextInt();
		    
		    System.out.println("Even no are : ");
		    for(i=s; i<=l; i++)
		    {
		    	try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	if(i%2 == 0)
		    	{
		    		System.out.println(i);
		    	}
		    	
		    }
		    System.out.println("Odd no are : ");
		    for(i=s; i<=l; i++)
		    {
		    	if(i%2 != 0)
		    	{
		    		System.out.println(i);
		    	}
		    	
		    }
		    
			
		}
}

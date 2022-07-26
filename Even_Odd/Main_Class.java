package Threads;

public class Main_Class  {
	public static void main(String[] args)
	{
		Odd_Class ob = new Odd_Class();
		Even_Class ob1 = new Even_Class();		
		ob.start();	
		ob1.start();
		
	}

}

package Threads;
// main class that calls the another classes
public class Main_Class  {
	public static void main(String[] args) // main method
	{
		Odd_Class ob = new Odd_Class(); // odd class object creating
		Even_Class ob1 = new Even_Class(); // even class object creating	
		ob.start(); // run method is calling
		ob1.start(); // run method is calling
		
	}

}

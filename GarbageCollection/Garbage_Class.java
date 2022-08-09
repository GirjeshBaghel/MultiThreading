package Enum;
import java.util.Scanner;

class Demo
{
	int x=10;
	int y = 20;
	void display()
	{
		System.out.println("X : "+x+" Y : "+y);
	}
	
}

public class Garbage_Class {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		Garbage_Class ob = new Garbage_Class();
		ob = null;
		System.gc();
		fun();
		fun2();
		boxing();
		unboxing();	
		 
		
	}
	
	static void fun()
	{
		Demo d = new Demo();
		d.display();
	}
	
	static void fun2()
	{
		Demo d = new Demo();
		d.display();		
	}
	public static void boxing()
	{
		System.out.println("\nThis is Boxing Process");
		System.out.println("Enter a no here : ");
		int a = sc.nextInt();
		Integer ob = new Integer(a);
		ob = 40;
		System.out.println("The value after boxing is : "+ob);
	}
	
	public static void unboxing()
	{
		System.out.println("\nThis is UnBoxing Process");
		System.out.println("Enter A no here : ");
		Integer ob = new Integer(sc.nextInt());		
		int a = ob;
		a = 50;
		System.out.println("The value after unboxing is : "+a);	
	}
	public  void finalize()
	{
		System.out.println("\nThis is Finalize Method is Overriden");
	}
	
	
}

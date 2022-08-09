package Enum;
import java.util.Scanner;

public class Food_Item { 

	enum food  // enum creation
	{
		Dhosa(100),Manchurian(150),Noodles(80),SpringRoll(70),GarlicBread(90); // enum data store
		int item;
		food(int item) // enum constructor
		{
			this.item = item;  // store a item from this keyword
		}
		
		public int food_accept()  // food method inside a enum 
		{
			return item;  // return a item
		}
	}
	public static void main(String[] args) // main method
	{
		calling(); // calling method calling
	}
	public static void calling() // calling method
	{
		food obj[] =food.values();  // store a enum in a array variable
		System.out.println("All the Items are here ");
		for(food f:obj)   // for loop is to store array in a f variable
		{
			System.out.println(f+" : "+f.item); // printing the enum data with its price
		}
		System.out.print("\nEnter the item name here : "); // taking the user choice here
		Scanner sc = new Scanner(System.in); 
		String choice;
		choice = sc.next();
		try {  			// try block to checking the exception
			System.out.print("The price of "+choice+" : "+food.valueOf(choice).food_accept());  // printing the user choice and price of the food
		}
		catch(Exception e)   
		{
			System.out.println("Please Choose correct Item here "); // catching the exception
		}
	}
}

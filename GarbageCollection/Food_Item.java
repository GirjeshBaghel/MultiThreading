package Enum;
import java.util.Scanner;

public class Food_Item { 

	enum food 
	{
		Dhosa(100),Manchurian(150),Noodles(80),SpringRoll(70),GarlicBread(90);
		int item;
		food(int item)
		{
			this.item = item;
		}
		
		public int food_accept()
		{
			return item;
		}
	}
	public static void main(String[] args)
	{
		calling();
	}
	public static void calling()
	{
		food obj[] =food.values();
		System.out.println("All the Items are here ");
		for(food f:obj)
		{
			System.out.println(f+" : "+f.item);
		}
		System.out.print("\nEnter the item name here : ");
		Scanner sc = new Scanner(System.in);
		String choice;
		choice = sc.next();
		try {
			System.out.print("The price of "+choice+" : "+food.valueOf(choice).food_accept());
		}
		catch(Exception e)
		{
			System.out.println("Please Choose correct Item here ");
		}
	}
}

/* woo yas got permission to skip the GUI for this
 
Program: MySavings.java          Last Date of this Revision: March 30th,2022

Purpose: An application that displays a menu of choices for entering different amounts into a piggy bank that can display the amount too

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */
 
import java.util.Scanner;
public class MySavings 
{
	private static double amount;
	private static double Newamount;
	
	public static void main(String[] args)
	{
			Scanner myObj = new Scanner(System.in);
			System.out.println("1. Show total in bank\n2. Add a penny\n3. Add a nickel\n4. Add a dime\n5. Add a quarter\n6. Take money out of bank\nEnter 0 to quit\nEnter your choice:"); //user input
			int number = myObj.nextInt(); //recording input
			
		do
		{
			
			
			switch (number) //starts a switch statement
			{
			case 0: System.out.println("Thanks for using this program!");
			case 1: System.out.println("Your amount is " + Newamount);
			case 2: Newamount = amount + 0.01;
			case 3: Newamount = amount + 0.05;
			case 4: Newamount = amount + 0.10;
			case 5: Newamount = amount + 0.25;
			case 6: 
			 
			}
			myObj.close();
			
		}while(number != 0);
	}

}

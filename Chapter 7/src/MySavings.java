/* woo yas got permission to skip the GUI for this
 
Program: MySavings.java          Last Date of this Revision: March 31st,2022

Purpose: An application that displays a menu of choices for entering different amounts into a piggy bank that can display the amount too

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */
 
import java.text.NumberFormat;
import java.util.Scanner;
public class MySavings 
{
	public static void main(String[] args) //starts class
	{
			Scanner myObj = new Scanner(System.in); //Allow for user to make a choice 
			int number;
			
			PiggyBank pB = new PiggyBank(0.00); //sets current value of bank act to 0
			
			NumberFormat money = NumberFormat.getCurrencyInstance(); //formatting money 
			
			double amt;
			
		do
		{
			System.out.println("1. Show total in bank\n2. Add a penny\n3. Add a nickel\n4. Add a dime\n5. Add a quarter\n6. Take money out of bank\nEnter 0 to quit\nEnter your choice:"); //user input
			number = myObj.nextInt(); //recording input
			
			switch (number) //starts a switch statement so they can make different choices
			{
			case 0: System.out.println("Thanks for using this program!"); break; //quits
			case 1: System.out.println("Your amount is " + money.format(pB.giveTotal())); //gives total amount from piggy
			case 2:  pB.addCoin(0.01); break; //adds money to piggy bank					
			case 3: pB.addCoin(0.05); break;
			case 4: pB.addCoin(0.10); break;
			case 5: pB.addCoin(0.25); break;
			case 6: //starts a statement to remove money 
			{
				System.out.println("How much do you want to take out"); //prompts user for the amount they want to remove
					amt = myObj.nextDouble(); //records it as double
					pB.RemoveCoins(amt); //starts the removecoins method from PiggyBank.java
					System.out.println("You now have: " +  money.format(pB.giveTotal())); //shows total amount of money that is left if possible
			}
					
					
			}		
			 	
		}while(number != 0); //if number is 0, close application
		myObj.close(); //closes scanner
	}

}


/* Screen Dump
 
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice:
5
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice:
5
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice:
6
How much do you want to take out
0.3
You now have: $0.20
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice:
4
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice:
1
Your amount is $0.30
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of bank
Enter 0 to quit
Enter your choice:
0
Thanks for using this program! */
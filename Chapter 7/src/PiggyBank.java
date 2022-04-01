/* woo yas got permission to skip the GUI for this
 
Program: PiggyBank.java          Last Date of this Revision: March 31st,2022

Purpose: Continuation of MySavings.java -- An application that displays a menu of choices for entering different amounts into a piggy bank that can display the amount too

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

public class PiggyBank //starts class
{
	private double balance; //balance as a variable
	
	public PiggyBank(double amount) //constructor method 
	{
		balance = amount; //balance is equal to the amount of money the person has 
	}
	
	public void addCoin(double cents) //to add coins
	{
		balance =  balance + cents; //they must add the cents to the balance; the amount added is controlled by MySavings.java
	}
	
	public double giveTotal() //showing total amount
	{
		return balance; //returns value the person currently has in their account 
	}
	
	public void RemoveCoins(double amt) //method to remove money 
	{
		if (amt > balance) //if the amount they want to remove is above what they have in their account at the moment 
		{
			System.out.println("You don't have sufficient funs :(("); //tells the user that they don't have the funds to remove that much 
		}
		else //if else 
		{
		balance = balance - amt; //go through with application and then remove the amount they wanted; it also displays how much they have left 
		}
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
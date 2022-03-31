/* woo yas got permission to skip the GUI for this
 
Program: PiggyBank.java          Last Date of this Revision: March 31st,2022

Purpose: Continuation of MySavings.java -- An application that displays a menu of choices for entering different amounts into a piggy bank that can display the amount too

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */
public class PiggyBank
{
	private double balance;
	
	public PiggyBank(double amount)
	{
		balance = amount;
	}
	
	public void addCoin(double cents)
	{
		balance =  balance + cents;
	}
	
	public double giveTotal()
	{
		return balance;
	}
	
	public void RemoveCoins(double amt)
	{
		if (amt > balance)
		{
			System.out.println("You don't have sufficient funs :((");
		}
		else
		{
		balance = balance - amt; 
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
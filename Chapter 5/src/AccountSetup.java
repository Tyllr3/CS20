//done
/*
Program: AccountSetup.java          Last Date of this Revision: February 24th,2022

Purpose: An application that prompts the user for a username and password, and keeps doing so until the password is 8 character or more. It should also convert everything to lowercase.

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20
*/
import java.util.Scanner;
public class AccountSetup {

	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter a username: "); //user input
		String user = myObj.next(); //records input
		user =user.toLowerCase(); //converts to lower case
	
		System.out.println("Enter a password with at least 8 characters: "); //user input
		String pass = myObj.next(); //records input
		pass = pass.toLowerCase(); //converts to lower case
		int s = pass.length();
		
		while (s < 8) //when the password is lesser or equal to 8 characters
		{
		System.out.println("Enter a password with at least 8 characters: "); //user input
		pass =  myObj.next();
		pass = pass.toLowerCase(); //converts to lower case
		}
		
		System.out.println("Your username is: "+user+" and your password is: "+pass); //output
		myObj.close();
	}

} //end of class

/* Screen Dump 
 Enter a username: 
DSAFS
Enter a password with at least 8 characters: 
256789gdsjwdfvascjk
Your username is: dsafs and your password is: 256789gdsjwdfvascjk */

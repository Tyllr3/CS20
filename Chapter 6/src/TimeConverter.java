//done  
/*
Program: TimeConverter.java          Last Date of this Revision: February 28th,2022

Purpose: An application that allows the user to convert between hours to minutes, minutes to hours, hours to days, and days to hours.

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

import java.util.Scanner;
public class TimeConverter 
{
	public static void hourstominutes() //converting hours to minutes
	{
		double hours, minutes;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of hours: "); //user input
		hours=input.nextDouble();// stores input
		input.close();
		
		minutes = hours*60; //converts hours to minutes
		System.out.println("The number of minutes are: " + minutes); //output
	}
	
	public static void minutestohours()
	{
		double hours, minutes;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes: "); //user input
		minutes=input.nextDouble();// stores input
		input.close();
		
		hours = minutes/60; //converts
		System.out.println("The number of hours are: " + hours);//output
	}
	
	public static void hourstodays()
	{
		double hours, days;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of hours: "); //user input
		hours=input.nextDouble();// stores input
		input.close();
		
		days=hours/24; //converts
		System.out.println("The number of days are: " + days);//output
	}

	public static void daystohours()
	{
		double hours, days;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of days: "); //user input
		days=input.nextDouble();// stores input
		input.close();
		
		hours = days*24; //converts
		System.out.println("The number of hours are: " + hours);//output
	}
	public static void main(String[] args) 
	{
	int choice;
	Scanner input=new Scanner(System.in); //allows user to pick which conversion they want to choose
	
	System.out.println("1. hours to minutes conversion."); //displays choices
	System.out.println("2. minutes to hours conversion.");
	System.out.println("3. hours to days conversion.");
	System.out.println("4. days to hours conversion.");
	choice = input.nextInt();
	if (choice ==1) //sends input to start the one corresponding to the number
		{
			hourstominutes();
		}
	else if (choice ==2)
		{
			minutestohours();
		}
	else if (choice ==3)
		{
		hourstodays();
		}
	else 
		{
		daystohours();
		} 
	input.close();
	}
} //end of class

/*Screen Dump 
1. hours to minutes conversion.
2. minutes to hours conversion.
3. hours to days conversion.
4. days to hours conversion.
3
Enter the number of hours: 
87
The number of days are: 3.625 */
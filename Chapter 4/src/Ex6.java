//done
/*
Program: Ex6.java          Last Date of this Revision: February 15th,2022

Purpose: An application that randomly generates 2 numbers and an operator and then tests the user to see if they get it right or not.

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20
*/
import java.util.Scanner;
import java.lang.Math;
public class Ex6 
{

	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in); 
		
		int first = (int) ((10)* Math.random() + 1); //random number 
		int second = (int) ((10)* Math.random() + 1); //random number
		int operator = (int) ((4)* Math.random() + 1); //random number for operator

		if (operator == 1) //if operator is 1 then it's multiplication
		{
			System.out.println("What is " + first + " * "+ second + "?"); //asks question
			int answer = myObj.nextInt(); //user input, records it
			int compAnswer = first * second;	
		
				if(compAnswer ==  answer) //if answer matches
				{
					System.out.println("Correct!"); //displays output
				}
				else //if answer doesn't match
				{
					System.out.println("Correct answer is: " + compAnswer); //displays output
				}
		}
		else if(operator == 2) //if operator is 2 then it's addition
		{
			System.out.println("What is " + first + " + "+ second + "?"); //asks question
			int answer = myObj.nextInt(); //user input, records it
			int compAnswer = first + second;	
		
				if(compAnswer ==  answer) //if answer matches
				{
					System.out.println("Correct!"); //displays output
				}
				else //if answer doesn't match
				{
					System.out.println("Correct answer is: " + compAnswer); //displays output
				}
		}
		
		else if(operator == 3) //if operator is 3 then it's subtraction
		{
			System.out.println("What is " + first + " - "+ second + "?"); //asks question
			int answer = myObj.nextInt();//user input, records it
			int compAnswer = first - second;	
		
				if(compAnswer ==  answer) //if answer matches
				{
					System.out.println("Correct!"); //displays output
				}
				else //if answer doesn't match
				{
					System.out.println("Correct answer is: " + compAnswer); //displays output
				}
		}
		
		else if(operator == 4) //if operator is 4 then it's division
		{
			System.out.println("What is " + first + " / "+ second + "? \nTo the smaller whole number\nEx.0.7 = 0"); //asks question
			int answer = myObj.nextInt();//user input, records it
			int compAnswer = first / second;	
		
				if(compAnswer ==  answer) //if answer matches
				{
					System.out.println("Correct!");//displays output
				}
				else //if answer doesn't match
				{ 
					System.out.println("Correct answer is: " + compAnswer); //displays output
				}
		}
		myObj.close(); //closes scanner
	}

} //end of class

/* Screen dump 
 * What is 5 + 8?
13
Correct! */

//Donee
/*
Program: Ex5.java          Last Date of this Revision: February 15th,2022

Purpose: An application that displays the letter grade to the percentage entered by the user.

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20
*/
import java.util.Scanner;
public class Ex5 
{

	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the percentage: "); //user input
		int number = myObj.nextInt(); //records input
		
		if (number >=90 && number <= 100) //if number is 90-100
		{
		System.out.println("The corresponding letter grade is: A"); //output
		}

		else if (number >=80 && number <= 89) //if number is 80-89
		{
		System.out.println("The corresponding letter grade is: B"); //output
		}
		
		else if (number >=70 && number <= 79) //if number 70-79
		{
		System.out.println("The corresponding letter grade is: C"); //output
		}
		
		else if (number >=60 && number <= 69) //if number 60-69
		{
		System.out.println("The corresponding letter grade is: D"); //output
		}
		
		else //if number below 60
		{
		System.out.println("The corresponding letter grade is: F"); //output
		}
	myObj.close(); //closes scanner
	}
} //end of class

/* Screen dump 
Enter the percentage: 
87
The corresponding letter grade is: B */
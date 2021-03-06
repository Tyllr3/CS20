/* 
Program: SurfsUp1.java          Last Date of this Revision: February 14th,2022

Purpose: An application that displays "Great day for surfing" when a wave height is 6 feet or over.

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20
*/
import java.util.Scanner;
public class SurfsUp1 
{

	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter wave height in feet: "); //user input
		int number = myObj.nextInt();//recording input
		if (number >= 6) //checks to see if the waves are 6 feet or over
		{
			System.out.println("Great day for surfing!"); //output message if 6 or over
		}
	
		myObj.close();
	}
} //end of class 

/* Screen Dump 
Enter wave height in feet: 
56
Great day for surfing! */
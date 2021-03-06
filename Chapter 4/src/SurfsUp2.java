/* s
Program: SurfsUp2.java          Last Date of this Revision: February 14th,2022

Purpose: An application that displays "Great day for surfing" when a wave height is 6 feet or over. and "Go body boarding" when it's less than 6 feet.

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20
*/
import java.util.Scanner;
public class SurfsUp2 
{

	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter wave height in feet: "); // input from user
		int number = myObj.nextInt();//recording input
		if (number >= 6) //checks to see if number is greater than 6 
		{
			System.out.println("Great day for surfing!"); // if greater than 6
		}
		else
		{
			System.out.println("Go body boarding!"); // if less than 6
		}
		myObj.close();
	}
} //end of class 

/* Screen Dump 
Enter wave height in feet: 
2
Go body boarding! */
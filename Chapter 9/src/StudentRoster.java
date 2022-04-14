/* Program: StudentRoster.java          Last Date of this Revision: April 11th,2022

Purpose: An application that prompts the user for the number of students in a class, their names and lists the names in an array
Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */
import java.util.Scanner;
public class StudentRoster //start of class
{

	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in);
		
		int num=1; //starts at first student
		String [] studentname; 
		
		System.out.println("Enter the amount of students: "); //user input
		int number = myObj.nextInt(); //records input
		studentname = new String[number]; //starts an array
		
		
		for (int i = 0; i<number; i++) //until it reaches the number entered, it prompts the user for the child's name
		{
			System.out.println("Student " + num + "'s name:");
			studentname [i] = myObj.next(); //stores name
			num = num + 1; //goes to the next student
		}
			
		System.out.println("\nStudent Roster:"); //displays roster
		
		for (String element: studentname) //every student
		{
			System.out.println(element); //displays in an array
		}
		myObj.close();
	} 

} //end of class 

/* 
 Enter the amount of students: 
5
Student 1's name:
Brian
Student 2's name:
John
Student 3's name:
Sam
Student 4's name:
Delilah
Student 5's name:
Morgan

Student Roster:
Brian
John
Sam
Delilah
Morgan */


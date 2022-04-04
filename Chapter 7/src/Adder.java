/* woo yas got permission to skip the GUI for this
 
Program: Adder.java          Last Date of this Revision: April 4th,2022

Purpose: An application that lets the user enter an answer for random numbers added together. It displays the score and keeps count too. The score differs for how many times the user took to get the answer right. 

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

import java.util.Scanner; //import scanner
public class Adder //Beginning of class
{

	public static void main(String[] args) 
	{
			int userans; //creates variables
			int answer;	
			int points = 0; //starts points at 0
	
		Scanner myObj = new Scanner(System.in); //Allow for user to make a choice 
		
		do //do while loop
		{
			int one = (int) ((20)* Math.random() + 1); //creates two random numbers between 1-20
			int two = (int) ((20)* Math.random() + 1);
			answer = one + two; //answer is set to those two added together
			
			System.out.println(one +"+"+ two +"="); //displays the problem
			userans = myObj.nextInt(); //allows for user to enter an answer
			
			if (userans == answer) //if answer is right the first time, they get 5 points 
			{
				points = points +5;
			}
			
			else if (userans != 999) //if not, and the number is not the exiting number, it asks again
			{
				System.out.println("Wrong answer, enter another one: ");
				userans = myObj.nextInt();
				
				if (userans == answer) //if answer is right after second try, they get 3 points 
				{
					points = points +3;
				}
				
				else if (userans != 999) //if not, and the number is not the exiting number, it asks again
				{
					System.out.println("Wrong answer, enter another one: ");
					userans = myObj.nextInt();
					
					if (userans == answer) //if answer is right after third try, they get 1 points 
					{
						points = points +1;
					}
					
					else if (userans != 999) //if not, and the number is not the exiting number, it displays the right answer
					{
						points = points +0;
						System.out.println("Correct answer is "+ answer);
					}
				}
			}
			 
			
		} while(userans != 999); //if number is the exiting number, it exits the program and it displays the points
		System.out.println("Your score is: "+ points); //displays points 
		myObj.close(); //closes scanner

	}
		
}

/* Screen Dump 
 
12+18=
30
18+4=
0
Wrong answer, enter another one: 
22
14+18=
0
Wrong answer, enter another one: 
0
Wrong answer, enter another one: 
32
18+10=
0
Wrong answer, enter another one: 
0
Wrong answer, enter another one: 
0
Correct answer is 28
18+5=
999
Your score is: 9 */

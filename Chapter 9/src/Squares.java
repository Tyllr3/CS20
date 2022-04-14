/* Program: Squares.java          Last Date of this Revision: April 12th,2022

Purpose: An application that stores he square of an element's index and displays them.
Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

public class Squares { //start of class

	public static void main(String[] args) 
	{
		int[]squares = new int[5]; //makes 5 indexes

		for (int i =0; i <= 4; i++) //between the numbers 0-4, add one 
		{
			squares[i] = i*i; //multiply number by itself to get the square
			System.out.println(i +":"+squares[i]); //displays original number and the squared one
		}
		 
	}

} //end of class

/*Screen Dump
0:0
1:1
2:4
3:9
4:16 */
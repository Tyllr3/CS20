/* Program: Squares.java          Last Date of this Revision: April 12th,2022

Purpose: An application that stores he square of an element's index and displays them.
Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

public class Squares {

	public static void main(String[] args) 
	{
		int[]squares = new int[5];

		for (int i =0; i <= 4; i++)
		{
			squares[i] = i*i;
			System.out.println(i +":"+squares[i]);
		}
		
	}

}

/*Screen Dump
0:0
1:1
2:4
3:9
4:16 */
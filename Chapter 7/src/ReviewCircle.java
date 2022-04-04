/* 
Program: ReviewCircle.java          Last Date of this Revision: March 15th,2022

Purpose: An application that allows the user to get the circumference of a circle, modified ver. of circle class

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

public class ReviewCircle //start of class 
{
	private static final double PI = 3.14; //pi is 3.14
	private double radius; //sets radius as a variable

	
	public ReviewCircle() //constructor method
	{
		radius = 3; //radius is set, default 
	}
	
	public void setRadius (double newRadius) //radius has been changed 
	{
		radius = newRadius;
	}
	  
	public double circumference() //calculates circumference of circle, method class
	{
		double Circlecircumference; //variable
		
		Circlecircumference=PI*radius*2; //equation 
		return (Circlecircumference);  //returns
	}
	
	public double area() //calculates area of circle, method class
	{
		
		double circleArea; //variable
			
		circleArea=PI*radius*radius; //equation 
		return (circleArea); //returns
		
	}
		
	public double getRadius() //returns radius
	{
		return(radius); //returns
	}
	
} //end of class

/* Screen Dump

Circle Radius: 3.0
Circle Circumference: 18.84  */
		
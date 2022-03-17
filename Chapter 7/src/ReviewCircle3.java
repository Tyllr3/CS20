/* 
Program: ReviewCircle3.java          Last Date of this Revision: March 17th,2022

Purpose: An application that modifies the previous one to have method that returns the formula for Area

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

public class ReviewCircle3 //start of class 
{
	private static final double PI = 3.14; //pi is 3.14
	private double radius; //sets radius as a variable

	public static void displayAreaFormula() //gives the option to display the formula
	{
		System.out.println("The formula for the area of a circle is a=Pi*r*r");
	}
	
	public ReviewCircle3() //constructor method
	{
		radius = 3; //radius is set, default 
	}
	
	public ReviewCircle3(double r) //Assigns radius as r
	{
		radius = r;
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

/*
Circle Radius: 6.0
Circle Circumference: 37.68
The formula for the area of a circle is a=Pi*r*r */
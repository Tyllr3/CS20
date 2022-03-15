/* 
Program: ReviewCircle2.java          Last Date of this Revision: March 15th,2022

Purpose: An application that modifies the previous one to have an overloaded constructor that accepts the radius of a circle object

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

public class ReviewCircle2 //start of class 
{
	private static final double PI = 3.14; //pi is 3.14
	private double radius; //sets radius as a variable

	public static void main (String[] args) //test class
	{
		ReviewCircle2 spot = new ReviewCircle2(); 
		spot.setRadius(3); //sets radius as 3
		System.out.println("Circle Radius: " + spot.getRadius()); //returns radius
		System.out.println("Circle Circumference: " + spot.circumference()); //returns circumference
	}
	
	public ReviewCircle2() //constructor method
	{
		radius = 3; //radius is set, default 
	}
	
	public ReviewCircle2(double r) //Assigns radius as r
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
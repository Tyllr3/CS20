/* 
Program: ReviewCircle4.java          Last Date of this Revision: March 17th,2022

Purpose: An application that modifies the previous one to override the equals() and toString() methods

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

public class ReviewCircle4 //start of class 
{
	private static final double PI = 3.14; //pi is 3.14
	private double radius; //sets radius as a variable

	public boolean equals(Object c)
	{
		ReviewCircle4 testObj = (ReviewCircle4)c;
		if (testObj.getRadius()== radius)
		{
			return(true);
		}
			else 
			{
				return(false);
			}
		}

	public String toString()
	{
		String circleString;
		circleString = "Circle has radius " + radius;
		return (circleString);
	}
	
	public static void displayAreaFormula()
	{
		System.out.println("The formula for the area of a circle is a=Pi*r*r");
	}
	
	public ReviewCircle4() //constructor method
	{
		radius = 3; //radius is set, default 
	}
	
	public ReviewCircle4(double r) //Assigns radius as r
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
	
}

/* Objects are not equal
Circle has radius 3.0
Circle has radius 4.0 */
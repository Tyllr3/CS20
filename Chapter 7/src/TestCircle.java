/* 
Program: TestCircle.java          Last Date of this Revision: March 17th,2022

Purpose: An application that allows for the Review circle classes to have an output and way to display their answers

Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

public class TestCircle {

	public static void main(String[] args) 
	{
		ReviewCircle spot = new ReviewCircle(); 
		spot.setRadius(3); //sets radius as 3
		System.out.println("Circle Radius: " + spot.getRadius()); //returns radius
		System.out.println("Circle Circumference: " + spot.circumference()); //returns circumference
		
		ReviewCircle2 spot2 = new ReviewCircle2(6); 
		System.out.println("Circle Radius: " + spot2.getRadius()); //returns radius
		System.out.println("Circle Circumference: " + spot2.circumference()); //returns circumference
		
		ReviewCircle3 spot3 = new ReviewCircle3(6); 
		System.out.println("Circle Radius: " + spot3.getRadius()); //returns radius
		System.out.println("Circle Circumference: " + spot3.circumference()); //returns circumference
		ReviewCircle3.displayAreaFormula();
		
		ReviewCircle4 spot4 = new ReviewCircle4(3); //sets first radius
		ReviewCircle4 spot5 = new ReviewCircle4(4); //sets second radius
		if (spot4.equals(spot5))
		{
			System.out.println("Objects are equal"); //checks to see if the circles are equal or not
		}
		else 
		{
			System.out.println("Objects are not equal");
		}

		System.out.println(spot4); //returns radius of spot 4
		System.out.println(spot5); //returns radius of spot 5

	}

}

/* Circle Radius: 3.0
Circle Circumference: 18.84

Circle Radius: 6.0
Circle Circumference: 37.68

Circle Radius: 6.0
Circle Circumference: 37.68
The formula for the area of a circle is a=Pi*r*r

Objects are not equal
Circle has radius 3.0
Circle has radius 4.0 */
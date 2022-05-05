/* Program: P2HotorCold.java          Last Date of this Revision: April 25th,2022

Purpose: If temp between 20-24, green led is on, if not, red led; display the temp to the user
Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

import com.phidget22.*;
public class P2HotOrCold 
{
	  public static void main(String[] args) throws Exception
	  {
		  	DigitalOutput redLED = new DigitalOutput();
	        DigitalOutput greenLED = new DigitalOutput();

	        //Address | Address your four objects which lets your program know where to find them.
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);
	        greenLED.setHubPort(4);
	        greenLED.setIsHubPortDevice(true);

	        //Open | Connect your program to your physical devices.
	        redLED.open(1000);
	        greenLED.open(1000);

	        //Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget. 
	        TemperatureSensor temperatureSensor = new TemperatureSensor();

	        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000  to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
	        temperatureSensor.open(1000);
	        

	        //Use your Phidgets | This code will print the temperature every 150ms
	        while (true) 
	        {
	        	double temp = temperatureSensor.getTemperature();
	        	if (temp >=20 && temp <=24) //if between 20-24 green led
	        	{
	            	System.out.println("Temperature: " + temp + " °C" );
	            	Thread.sleep(150);
	            	redLED.setState(false);
	            	greenLED.setState(true);
	        	}
	        	
	        	else //if outside, then red 
	        	{
	        		System.out.println("Temperature: " +temp + " °C" );
	        		Thread.sleep(150);
	            	redLED.setState(true);
	            	greenLED.setState(false); 
	        	} 

	        }
	  }
	  
} //end of class

/* Screen Dump 
//red led on for below:
 
Temperature: 26.29 °C
Temperature: 26.29 °C
Temperature: 26.29 °C
Temperature: 26.29 °C
Temperature: 26.29 °C
Temperature: 26.29 °C
Temperature: 26.29 °C
Temperature: 26.33 °C
Temperature: 26.33 °C
Temperature: 26.33 °C
Temperature: 26.33 °C
Temperature: 26.33 °C
Temperature: 26.33 °C
Temperature: 26.34 °C
Temperature: 26.34 °C */
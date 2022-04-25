/* Program: P3Thermostat.java          Last Date of this Revision: April 25th,2022

Purpose: create a thermostat that you can change the temp of, and blinks lights based off of how far or close the temp is to the set; 21
Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

import com.phidget22.*;
public class P3Thermostat 
{
	  public static void main(String[] args) throws Exception
	  {
	        //Create | Create objects for your buttons and LEDs.
	        DigitalInput redButton = new DigitalInput();
	        DigitalOutput redLED = new DigitalOutput();
	        DigitalInput greenButton = new DigitalInput();
	        DigitalOutput greenLED = new DigitalOutput();

	        //Address | Address your four objects which lets your program know where to find them.
	        redButton.setHubPort(0);
	        redButton.setIsHubPortDevice(true);
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);
	        greenButton.setHubPort(5);
	        greenButton.setIsHubPortDevice(true);
	        greenLED.setHubPort(4);
	        greenLED.setIsHubPortDevice(true);

	        //Open | Connect your program to your physical devices.
	        redButton.open(1000);
	        redLED.open(1000);
	        greenButton.open(1000);
	        greenLED.open(1000);

	        //Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget. 
	        TemperatureSensor temperatureSensor = new TemperatureSensor();

	        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000  to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
	        temperatureSensor.open(1000);
	        
	    	double temp, setTemp = 21;
	    	boolean redState = false;
	    	boolean greenState = false;
	    	double printTemp = 10;
	        //Use your Phidgets | This code will print the temperature every 150ms
	        while (true) 
	        {
	        	temp = temperatureSensor.getTemperature();
	        	
	        	if (setTemp >=19 && setTemp <=23) //if between 2 of 21, green led
	        	{
	            	redLED.setState(false);
	            	greenLED.setState(true);
	        	}
	        	
	        	else //if outside, then red 
	        	{
	            	redLED.setState(true);
	            	greenLED.setState(false); 
	        	} 
	
	        	
	        	if( redButton.getState() && !redState)
	        	 {
	                setTemp--;
	                System.out.println("Set Temperature: " + setTemp);	               
	        	 }
	        	else if(greenButton.getState() && !greenState)
	             {
	            	 setTemp++;
	            	 System.out.println("Set Temperature: " + setTemp);	
	             }
	        	//track button state
	        	redState = redButton.getState();
	        	greenState = greenButton.getState();

	        	
	        	if (printTemp >=10)
	        	{
	        		System.out.println("Temperature: " +temp + " °C" ); //print temp every 10 seconds
	        		System.out.println("Set Temperature: " + setTemp);
	        		printTemp = 0;
	        	}
	        	printTemp = printTemp + 0.15;
	        	Thread.sleep(150);
	      
		    }
	     }
}

/* Program: MethodsLEDBrightness.java          Last Date of this Revision: April 26th,2022

Purpose: Increases brightness and then decreases brightness
Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

//Add Phidgets Library 
import com.phidget22.*;

public class MethodsLEDBrightness {
    //Handle Exceptions 
    public static void main(String[] args) throws Exception{

        //Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000); //with 0 as it's brightness, it's off, as 0.5, it's half bright and 1.0 is fully bright
        double num = 0.1; //going up, increasing brightness
        double numm = 1.0; //going down, decreasing brightness

        //Use your Phidgets with Duty Cycle | Duty Cycle controls the power to your Phidget (Digital Output object). Duty Cycle values range from 0.0 - 1.0.
        while (true)
        {
        	if (num >=0.1 && num <1.0) //while between 0.1 and not 1.0, increase 
        	{
	        	redLED.setDutyCycle(num);
	        	Thread.sleep(1000);
	        	redLED.setDutyCycle(0.0);
	        	num = num +0.1;
        	}
        	
        	if (num >=1.0 && num >0.0) //when it reaches 1.0 and is above 0, decrease
        	{
        		redLED.setDutyCycle(numm);
	        	Thread.sleep(1000);
	        	redLED.setDutyCycle(0.0);
        		numm = numm -0.1;
        	}
        	
        	if (numm <=0.0) //when it becomes 0.0, stay 0.0
        	{
        		numm = 0.0;
        		redLED.setDutyCycle(numm);
        	}
        }
    }
}
  
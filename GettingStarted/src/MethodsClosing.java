/* Program: MethodsClosing.java          Last Date of this Revision: April 26th,2022

Purpose: See how opening and closing certain sensors affect the code
Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

//Add Phidgets Library
import com.phidget22.*;

public class MethodsClosing {
    public static void main(String[] args) throws Exception{

        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open
        temperatureSensor.open(1000);

        //Use your Phidgets
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
        //Close your Phidgets
        temperatureSensor.close();
        
        temperatureSensor.open(1000);
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
    }
} //end of class
  
/* P1;
If trying to call temperature after close, you get the error:

"Exception in thread "main" PhidgetException 0x34 (Device not Attached)
This can happen for a number of common reasons. Be sure you are opening the channel before trying to use it. If you are opening the channel, the program may not be waiting for the channel to be attached. If possible use openWaitForAttachment. Otherwise, be sure to check the Attached property of the channel before trying to use it.
	at com.phidget22.TemperatureSensorBase.getTemperature(Native Method)
	at MethodsClosing.main(MethodsClosing.java:19)"

This is because the sensor is closed and it can't be called */

//

/* P2
 If you open it after you close it, you can get the temperature again, you just have to make sure the device is open */
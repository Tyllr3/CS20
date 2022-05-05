/* Program: L1BlinkLEDp3.java          Last Date of this Revision: April 19th,2022

Purpose: modify blink led, blink green
Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class L1BlinkLEDp3 {
  //Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
  public static void main(String[] args) throws Exception{

      //Create | Here you've created a DigitalOutput object for your LED. An object represents how you interact with your device. DigitalOutput is a class from the Phidgets library that's used to provide a voltage to things like LEDs.
      DigitalOutput greenLED = new DigitalOutput();

      //Address | This tells your program where to find the device you want to work with. Your LED is connected to port 1 and your code reflects that. IsHubPortDevice must be set if you are not using a Smart Phidget (more on this later).
      greenLED.setHubPort(4);
      greenLED.setIsHubPortDevice(true); //green led is set to on

      //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
      greenLED.open(2000);
      
      //Use your Phidgets | Here is where you can have some fun and use your Phidgets! You can turn your LED on/off by setting the state to true/false. The sleep command keeps your LED on by letting 1000 milliseconds pass before turning the LED off.
      while(true){
    	  greenLED.setState(true); //if button is pushed, turn led off
          Thread.sleep(1000);
          greenLED.setState(false);
          Thread.sleep(1000);
      }
  }
} //end of class

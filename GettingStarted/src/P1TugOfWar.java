/* Program: TugOfWar.java          Last Date of this Revision: April 21st,2022

Purpose: create a game of tug of war where the first person to reach 10 presses wins; win is displayed by both lights flashing and then the winners light 5 times.
Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */
import com.phidget22.*;
public class P1TugOfWar 
{
	  public static void main(String[] args) throws Exception
	  {

	        //Create | Create objects for your buttons and LEDs.
	        DigitalInput redButton = new DigitalInput();
	        DigitalOutput redLED = new DigitalOutput();
	        DigitalInput greenButton = new DigitalInput();
	        DigitalOutput greenLED = new DigitalOutput();
	        int red = 0;
	        int green = 0;

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
	        
	        while(true){
	            if( redButton.getState()){
	                redLED.setState(true);
	            } else {
	                redLED.setState(false);
	            }

	            if(greenButton.getState()){
	                greenLED.setState(true);
	            } else {
	                greenLED.setState(false);
	            }
	            
	            if(redLED.getState()==true)
	            {
	            	red = red +1;
	            	Thread.sleep(300); 
	            }
	                  
	            if(greenLED.getState()==true)
	            {
	            	green = green +1;
	            	Thread.sleep(300); 
	            }
	            
	            if (red >=10)
	            {
	            	 redLED.setState(true); greenLED.setState(true);
	                 Thread.sleep(1000);
	                 redLED.setState(false); greenLED.setState(false);
	                 Thread.sleep(1000);
	                 redLED.setState(true);
	                 Thread.sleep(1000);
	                 redLED.setState(false);
	                 Thread.sleep(1000);
	                 redLED.setState(true);
	                 Thread.sleep(1000);
	                 redLED.setState(false);
	                 Thread.sleep(1000);
	                 redLED.setState(true);
	                 Thread.sleep(1000);
	                 redLED.setState(false);
	                 Thread.sleep(1000);
	                 redLED.setState(true);
	                 Thread.sleep(1000);
	                 redLED.setState(false);
	                 Thread.sleep(1000);
	                 redLED.setState(true);
	                 Thread.sleep(1000);
	                 redLED.setState(false);
	                 Thread.sleep(1000);
	                break;
	            }
	            
	            if (green >= 10)
	            {
	            	 redLED.setState(true); greenLED.setState(true);
	                 Thread.sleep(1000);
	                 redLED.setState(false); greenLED.setState(false);
	                 Thread.sleep(1000);
	                 greenLED.setState(true);
	                 Thread.sleep(1000);
	                 greenLED.setState(false);
	                 Thread.sleep(1000);
	                 greenLED.setState(true);
	                 Thread.sleep(1000);
	                 greenLED.setState(false);
	                 Thread.sleep(1000);
	                 greenLED.setState(true);
	                 Thread.sleep(1000);
	                 greenLED.setState(false);
	                 Thread.sleep(1000);
	                 greenLED.setState(true);
	                 Thread.sleep(1000);
	                 greenLED.setState(false);
	                 Thread.sleep(1000);
	                 greenLED.setState(true);
	                 Thread.sleep(1000);
	                 greenLED.setState(false);
	                 Thread.sleep(1000);
	                 break;
	            }
	        }
	  }
}

/* Program: EventButton.java          Last Date of this Revision: April 27th,2022

Purpose: tells the state of the button when it's pressed/ let go
Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

//Add Phidgets Library
import com.phidget22.*;

public class EventButton {
    //Handle Exceptions
    public static void main(String[] args) throws Exception {
       
        //Create
        DigitalInput redButton = new DigitalInput(); //red button
        DigitalInput greenButton = new DigitalInput(); //green button

        //Address
        redButton.setIsHubPortDevice(true);
        redButton.setHubPort(0);
        greenButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);

        //Event | Event code runs when data input from the sensor changes. The following event is a state change event. The code will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() //listener
        {
            public void onStateChange(DigitalInputStateChangeEvent e) 
            {
                if (e.getState())
                {
                	System.out.println("Red button pressed"); //tells you if the button is pressed
                }
                
                else
                {
                	System.out.println("Red button not pressed"); //tells you if the button is not pressed
                }
            }
        });
        
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e) 
            {
                if (e.getState())
                {
                	System.out.println("Green button pressed"); 
                }
                
                else
                {
                	System.out.println("Green button not pressed");
                }
            }
        });

        //Open
        redButton.open(1000);
        greenButton.open(1000);

        //Keep program running
        while (true) {
            Thread.sleep(150);
        }
    }
} //end of class
  

/* Practice 1 - In lesson two, it told the state regardless of whether or not the button was being pressed, it always kept telling in case the situation would arise.
 For this one, it only displays if the button is pressed or let go. Theres a DigitalInputStateChange event and a listener for this event unlike the other one from lesson two.
 Practice 2 - The behavior of the code doesn't change.
 Practice 3 - In code.
 Practice 4 - in code.
 
 
Screen Dump
Red button not pressed
Green button not pressed
Green button pressed
Green button not pressed
Red button pressed
Red button not pressed
Green button pressed
Red button pressed
Green button not pressed
Red button not pressed
Red button pressed
Red button not pressed
Red button pressed
Red button not pressed
Green button pressed
Green button not pressed */

/* Program: EventButtonandLEDp3.java          Last Date of this Revision: April 27th,2022

Purpose: corresponding led blinks w button and shows amount of times button has been pressed
Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

//Add Phidgets Library
import com.phidget22.*;

public class EventButtonandLEDp3 {
    //Turn on/off LEDs with Global Variables
    static boolean turnRedLEDOn = false; //sets initial state as false
    static boolean turnGreenLEDOn = false;

    //Handle Exceptions
    public static void main(String[] args) throws Exception {

        //Create
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Event | Event code runs when data input from the sensor changes. The following event is a state change event. The code will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                //Record button state to turn on/off the red LED
                turnRedLEDOn = e.getState(); 
            }
        });

        //Event | Event code runs when data input from the sensor changes. The following event is a state change event. It will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                //Record button state to turn on/off the green LED
                turnGreenLEDOn = e.getState();
            }
        });

        //Open
        redLED.open(1000);
        greenLED.open(1000);
        redButton.open(1000);
        greenButton.open(1000);
        int num =0;
        //Use your Phidgets | In the button events you recorded the Button State. Here we will use that data to turn on/off the LEDs
        while(true) {
            //turn red LED on based on red button input
            redLED.setState(turnRedLEDOn);
            //turn green LED on based on green button input
            greenLED.setState(turnGreenLEDOn);
            //sleep for 150 milliseconds 
            Thread.sleep(150);
            
          if(redLED.getState()==true || greenLED.getState()==true) //if red or green button is pushed 
                {
                	  num = num +1;
              	    System.out.println("Amount of button presses "+ num ); //displays the number of button presses
              	  
            }
        }
    }
}


/* Screen Dump
 Amount of button presses 1
Amount of button presses 2
Amount of button presses 3
Amount of button presses 4
Amount of button presses 5
Amount of button presses 6
Amount of button presses 7
Amount of button presses 8
Amount of button presses 9
Amount of button presses 10
Amount of button presses 11
Amount of button presses 12
Amount of button presses 13
Amount of button presses 14
Amount of button presses 15
Amount of button presses 16
Amount of button presses 17
Amount of button presses 18
Amount of button presses 19
Amount of button presses 20
Amount of button presses 21
Amount of button presses 22
Amount of button presses 23
Amount of button presses 24
Amount of button presses 25
Amount of button presses 26
Amount of button presses 27
Amount of button presses 28
Amount of button presses 29
Amount of button presses 30
Amount of button presses 31
Amount of button presses 32 */

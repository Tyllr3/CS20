/* Program: EventButtonandLEDp4.java          Last Date of this Revision: April 27th,2022

Purpose: corresponding led blinks w button, tug of war
Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

//Add Phidgets Library
import com.phidget22.*;

public class EventButtonandLEDp4 {
    //Turn on/off LEDs with Global Variables
    static boolean turnRedLEDOn = false; //initial state false
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
        int red =0;
        int green = 0;
        
        //Use your Phidgets | In the button events you recorded the Button State. Here we will use that data to turn on/off the LEDs
        while(true) {
            //turn red LED on based on red button input
            redLED.setState(turnRedLEDOn);
            //turn green LED on based on green button input
            greenLED.setState(turnGreenLEDOn);
            //sleep for 150 milliseconds 
            Thread.sleep(150);
            
            if(redLED.getState()==true) //if it's pressed, add one to the variable
            {
            	red = red +1;
            }
                  
            if(greenLED.getState()==true)
            {
            	green = green +1;
            }
            
            if (red >=10) //if red reaches 10 or more red wins
            {
            	 redLED.setState(true); greenLED.setState(true);
                 System.out.println("RED WINS");
                 break;
            }
            
            if (green >= 10) //if green reaches 10 or more, green wins
            {
            	redLED.setState(true); greenLED.setState(true);
                System.out.println("GREEN WINS");
                break;
            }
        }
    }
}


/* Screen Dump

RED WINS */
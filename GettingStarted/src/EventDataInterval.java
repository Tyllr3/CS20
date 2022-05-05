/* Program: EventButton.java          Last Date of this Revision: April 27th,2022

Purpose: change how often data is outputted 
Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

//Add Phidgets Library
import com.phidget22.*;

public class EventDataInterval {
    //Handle Exceptions
    public static void main(String[] args) throws Exception {

        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Temperature Event |  Event code runs when data input from the sensor changes. The following event is a Temperature change event. The contained code will only run when the temperature input changes.
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                System.out.println("Temperature: " + e.getTemperature()); //prints out the temperature
            }
        });

        //Open
        temperatureSensor.open(5000);

        //Set Data Interval | The Data Interval controls how often the program collects data from your Phidget. The Data Interval ranges from 500 ms - 60000 ms.
        temperatureSensor.setDataInterval(5000);

        //Keep program running
        while (true) {
            Thread.sleep(150);
        }
    }
} //end of class
 

/* P1 - 5000: displays every 5 seconds
 P2 - 60,000: displays every minute
 P3 - The LED buttons would not have an interval, other wise you'd have to hold the button for that entire interval instead of just pushing the button and letting go when you're done.
 */

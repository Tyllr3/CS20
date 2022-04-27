/* Program: EventButton.java          Last Date of this Revision: April 27th,2022

Purpose: Attaching and Detaching components
Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

//Add Phidgets Library
import com.phidget22.*;

public class EventAttachDetach 
{
    static boolean turnRedLEDOn = false;
    public static void main(String[] args) throws Exception {
       
         //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();

        //Address
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                //Record button state to turn on/off the red LED
                turnRedLEDOn = e.getState(); 
            }
      
    });
        
        redLED.open(1000);
        redButton.open(1000);
   
      

        //Data Event | Event code runs when data from sensor changes. 
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() 
        {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) 
            {
                //Print temperature
                System.out.println("Temperature: " + e.getTemperature() + "°C");
            }   
       
        });
        
        //Attach Event | Attach Events run when a Phidget is connected to the Object
        temperatureSensor.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach TEMP SENSOR!");
            }
        });
        
        redButton.addAttachListener(new AttachListener() {
        public void onAttach(AttachEvent e) {
            System.out.println("Attach RED BUTTON!");
        }
    });
        
        redLED.addAttachListener(new AttachListener() {
            public void onAttach(AttachEvent e) {
                System.out.println("Attach RED LED!");
            }
        });


        //Detach Event | Detach Events run when a Phidget is disconnected from the Object
        temperatureSensor.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach TEMP SENSOR!");
            }
        });
        
        redButton.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach RED BUTTON!");
            }
        });
        
        redLED.addDetachListener(new DetachListener() {
            public void onDetach(DetachEvent e) {
                System.out.println("Detach RED LED!");
            }
        });



        //Open
        temperatureSensor.open(1000);

        //Keep program running
        while (true)
        {
        	redLED.setState(turnRedLEDOn);
            Thread.sleep(150);
        }
    }
            }
      
    


         

/*P1 - When the usb is pulled, it displays detach and when it's plugged back in, is displays attach and continues with the program instead of displaying an error.
Attach!
Temperature: 26.87°C
Temperature: 26.87°C
Temperature: 26.86°C
Temperature: 26.87°C
Temperature: 26.86°C
Detach!
Attach!
Temperature: 26.86°C
Temperature: 26.88°C
Temperature: 26.88°C
Temperature: 26.88°C
Temperature: 26.88°C 

P2 - in code

Attach TEMP SENSOR!
Temperature: 27.57°C
Temperature: 27.56°C
Temperature: 27.57°C
Temperature: 27.57°C
Detach TEMP SENSOR!
Detach RED BUTTON!
Detach RED LED! */
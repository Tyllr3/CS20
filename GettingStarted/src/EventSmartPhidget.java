/* Program: EventButtonandLEDp2.java          Last Date of this Revision: April 27th,2022

Purpose: Display temp and hum
Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

//Add Phidgets Library
import com.phidget22.*;

public class EventSmartPhidget {

    public static void main(String[] args) throws Exception {
        
        //Create
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Humidity Event |  Event code runs when data input from the sensor changes. The following event is a Humidity change event. The contained code will only run when the humidity input changes.
        humiditySensor.addHumidityChangeListener(new HumiditySensorHumidityChangeListener() //listeners
        {
            public void onHumidityChange(HumiditySensorHumidityChangeEvent e) 
            {
                System.out.println("Humidity: " + e.getHumidity() + "%RH"); //print humidity when it changes
            }
        });
        
        //Temperature Event |  Event code runs when data input from the sensor changes. The following event is a Temperature change event. The contained code will only run when the temperature input changes.
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() 
        {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) 
            {
                if (e.getTemperature() >= 21)
                {
            	System.out.println("Temperature: " + e.getTemperature() + "°C"); //if temp is more or equal to 21, print when it changes
                }

            	else
	            {
	            	System.out.println("Temperature: is too cold"); //if not 
	            }
            }
        }); 

        //Open
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Keep program running
        while (true) {
            Thread.sleep(150);
        }
    }
} //end of class

/* P1:
 The code only prints if the temperature or humidity changes; the one in lesson 3 would print it continuously regardless of whether or not it changed, but this one has a change listener so it helps to only print when needed. 
 P2: in code
 
 
Screen Dump

Temperature: is too cold
Humidity: 10.53%RH
Temperature: is too cold
Humidity: 10.58%RH
Temperature: is too cold
Humidity: 10.76%RH
Temperature: 26.71°C
Humidity: 11.73%RH
Temperature: 26.71°C
Humidity: 11.69%RH
Temperature: 26.71°C
Humidity: 11.64%RH
Temperature: 26.7°C
Humidity: 11.57%RH */
  
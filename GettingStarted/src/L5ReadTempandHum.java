/* Program: L5ReadTempandHum.java          Last Date of this Revision: April 21st,2022

Purpose: Reads Temp and Hum and displays if Temp is greater t han 21 and hum is greater than 30.
Author: Tyler Grewal 
School: CHHS
Course: Computer Programming 20 */

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class L5ReadTempandHum {
    public static void main(String[] args) throws Exception{

        //Create | Here you've created a HumiditySensor and a TemperatureSensor object for your Humidity Phidget. This allows you to access both temperature and humidity data from your Phidget.
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000 to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception occur.
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Use your Phidgets | This code will print humidity and temperature read by the sensor every 150ms.
        while(true){
        	double hum =humiditySensor.getHumidity();
        	double temp = temperatureSensor.getTemperature();
        	if (hum>30 && temp >21)
        	{
        		System.out.println("Humidity: " + hum +" %RH, Temperature: " + temp + " °C" );
        		Thread.sleep(150);
        	}
        	else
        	{
        		System.out.println("Humidity is too low, or temperature is too cold.");
        		 Thread.sleep(150);
        	}
        }
    }
}
  

/*Screen Dump

Humidity is too low, or temperature is too cold.
Humidity is too low, or temperature is too cold.
Humidity is too low, or temperature is too cold.
Humidity is too low, or temperature is too cold.
Humidity: 30.11 %RH, Temperature: 26.62 °C
Humidity: 30.11 %RH, Temperature: 26.62 °C
Humidity: 30.11 %RH, Temperature: 26.63 °C
Humidity: 30.86 %RH, Temperature: 26.63 °C
Humidity: 30.86 %RH, Temperature: 26.63 °C
Humidity: 30.86 %RH, Temperature: 26.63 °C
Humidity: 30.86 %RH, Temperature: 26.63 °C
Humidity: 31.57 %RH, Temperature: 26.63 °C
Humidity: 31.57 %RH, Temperature: 26.63 °C
Humidity: 31.57 %RH, Temperature: 26.63 °C
Humidity: 32.2 %RH, Temperature: 26.63 °C
Humidity: 32.2 %RH, Temperature: 26.63 °C
Humidity: 32.2 %RH, Temperature: 26.64 °C
Humidity: 32.76 %RH, Temperature: 26.64 °C
Humidity: 32.76 %RH, Temperature: 26.64 °C
Humidity: 32.76 %RH, Temperature: 26.65 °C
Humidity: 33.26 %RH, Temperature: 26.65 °C
Humidity: 33.26 %RH, Temperature: 26.65 °C */
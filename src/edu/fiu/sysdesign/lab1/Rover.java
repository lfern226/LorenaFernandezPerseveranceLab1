/**
 * 
 */
package edu.fiu.sysdesign.lab1;

/**
 * @author lfern
 *
 */
public class Rover {
String name;
String brains;
int temperature_control;
String robotic_arm;
String wheels_legs;

void processing_info()
/**
 * This operation is vital for the Rover to function properly and processes information that it comes across and sent from Nasa 
 */
{}

void check_temperature()
/**
 * This operation will check and make sure that the Rover's current temperature is stable
 */
{}

void adjust_temperature()
/**
 * This operation will come to play if the Rover is not at its ideal stable temperature and will adjust accordingly
 */
{}

void collecting_samples()
/**
 * This operation is performed in order to collect samples discovered on Mars
 */
{}

void mobility()
/**
 * This operation promotes mobility for the Rover itself thus moving forward, backward, left, right, spinning/rotating
 */
{}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Voice_Ears myVoice_Ears = new Voice_Ears();
myVoice_Ears.runSelfCheck();
	}

}

/**
 * 
 */
package edu.fiu.sysdesign.lab1;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author lfern
 *
 */
public class Nasa implements SelfCheckCapable {
String satellites;
String operating_space;
String operators;

void receive_data()
/**
 * This operation describes receiving data from the Rover of its encounters
 */
{}

void send_command()
/**
 * This operation allows the Nasa team to send commands to the Rover to perform whatever action is necessary on their behalf
 */
{}


	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}

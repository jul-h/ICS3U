package ha;


import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;

/**
 * EndProgram.java
 * This class ends the program once the escape button is held down.
 * June 12, 2017
 * @author Julie Ha
 *
 */

public class EndProgram implements Behavior {
	/**
	 * Takes control of the robot when the escape button is pressed down on the robot.
	 */
	public boolean takeControl(){
		if(Button.ESCAPE.isDown()){
			return true;
		}
		return false;
	}

	/**
	 * Exits the program.
	 */
	public void action(){
		System.exit(0);
	}	

	/**
	 * Action is never suppressed.
	 */
	public void suppress(){

	}
}

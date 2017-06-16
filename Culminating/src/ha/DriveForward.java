package ha;

import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

/**
 * DriveForward.java
 * This class drives forward at all times unless a condition is met for a behaviour of a higher priority.
 * Created June 12, 2017
 * @author Julie Ha
 *
 */

public class DriveForward implements Behavior {
	private boolean suppressed = false;

	/**
	 * Takes control of the robot all the time.
	 * @return boolean = Always return true.
	 */
	public boolean takeControl(){
		return true;
	}

	/**
	 * Drives motors A and C forward.
	 */
	public void action(){
		suppressed = false;
		Motor.A.setSpeed(200);
		Motor.C.setSpeed(200);
		Motor.A.forward();
		Motor.C.forward();

		while (!suppressed){
			Thread.yield();
		}
		Motor.A.stop();
		Motor.C.stop();
	}

	/**
	 * Stops Motors A and C.
	 */
	public void suppress(){
		suppressed = true;
	}
}

package ha;

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

/**
 * HearSound.java
 * This class hears sound and if it does it stops motors A and C.
 * June 14, 2017
 * @author Julie Ha
 *
 */

public class HearSound implements Behavior {
	private boolean suppressed = false;

	/**
	 * Takes control if a sound level higher than 50 is heard.
	 * @return boolean - Returns true when the sound level is higher than 50.
	 */
	@Override
	public boolean takeControl() {
		SoundSensor sound = new SoundSensor (SensorPort.S4, true);
		if (sound.readValue() > 75)
			return true;
		return false;
	}

	/**
	 * Stops motors A and C.
	 */
	@Override
	public void action() {
		Motor.A.stop();
		Motor.C.stop();
	}

	/**
	 * Stops motors A and C.
	 */
	@Override
	public void suppress() {
		suppressed = true;
	}

}

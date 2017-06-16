package ha;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

/**
 * KnockBottles.java
 * This class knocks bottles.
 * Created June 13, 2017
 * @author Julie Ha
 *
 */

public class KnockBottles implements Behavior {

	private boolean suppressed = false;

	/**
	 * Takes control of the robot when the light is greater than a brightness level of 40.
	 * @return boolean - Returns true when light is greater than a brightness level of 40.
	 */
	@Override
	public boolean takeControl() {
		LightSensor light = new LightSensor (SensorPort.S2);
		if (light.getLightValue() > 40) 
			return true;
		return false;
	}

	/**
	 * Finds and knocks down white bottle.
	 */
	@Override
	public void action() {
		suppressed = false;
		UltrasonicSensor ultra = new UltrasonicSensor(SensorPort.S1);
		
		int distance = 0;
		//move back 23 cm 
		while (distance != 23){
			distance = ultra.getDistance();
			Motor.A.backward();
			Motor.C.backward();
		}

		//rotate to the left
		Motor.A.rotate(180, true);
		Motor.C.rotate(-180, true);
		Delay.msDelay(1000);

		//move the claw 
		Motor.B.setSpeed(1080);
		Motor.B.rotate(60);
		Delay.msDelay(500);
		Motor.B.rotate(-60);
		Delay.msDelay(500);

		//rotate to the right
		Motor.A.rotate(-140, true);
		Motor.C.rotate(140, true);
		Delay.msDelay(1000);
		
		
	}

	/**
	 * Stops looking for white bottle.
	 */
	@Override
	public void suppress() {
		suppressed = true;
	}

}

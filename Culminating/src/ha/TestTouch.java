package ha;

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.robotics.subsumption.Behavior;

public class TestTouch implements Behavior {
	private boolean suppressed = false;
	@Override
	public boolean takeControl() {
		TouchSensor touch = new TouchSensor (SensorPort.S1);
		if (touch.isPressed())
			return true;
		return false;
	}

	@Override
	public void suppress() {
		suppressed = true;

	}

	@Override
	public void action() {
		suppressed = false;
		Motor.A.stop();
		Motor.C.stop();
		while(!suppressed){
			Thread.yield();
		}
	}

}

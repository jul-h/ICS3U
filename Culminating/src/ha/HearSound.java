package ha;

import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.robotics.subsumption.Behavior;

public class HearSound implements Behavior {
	private boolean suppressed = false;
	@Override
	public boolean takeControl() {
		SoundSensor sound = new SoundSensor (SensorPort.S4, true);
		if (sound.readValue() > 50)
			return true;
		return false;
	}

	@Override
	public void suppress() {
		suppressed = true;
	}

	@Override
	public void action() {
		Motor.A.stop();
		Motor.C.stop();

	}

}

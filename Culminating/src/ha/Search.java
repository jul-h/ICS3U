package ha;

import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;

public class Search implements Behavior {
	private boolean suppressed = false;
	@Override
	public boolean takeControl() {
		return true;
	}

	@Override
	public void suppress() {
		suppressed = true;
	}

	@Override
	public void action() {
		Motor.A.rotate(180, true);
		Motor.C.rotate(-180, true);
	}

}

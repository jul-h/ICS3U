package ha;

import lejos.nxt.Motor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

public class DriveForward implements Behavior {
	private boolean suppressed = false;
	public boolean takeControl(){
		return true;
	}
	public void suppress(){
		suppressed = true;
	}
	public void action(){
		suppressed = false;
		Motor.A.forward();
		Motor.C.forward();
		while (!suppressed){
			Thread.yield();
		}
		Motor.A.stop();
		Motor.C.stop();
	}

}

package ha;

import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class Main {

	public static void main(String[] args) {
		Behavior b1 = new DriveForward(); //lowest priority
		Behavior b2 = new Stop(); //highest priority
		Behavior[] behaviors = {b1,b2};
		Arbitrator arby = new Arbitrator (behaviors);
		arby.start();
	}

}

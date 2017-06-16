package ha;

import lejos.robotics.subsumption.Arbitrator;
import lejos.robotics.subsumption.Behavior;

public class Main {

	public static void main(String[] args) {
		Behavior b1 = new DriveForward(); //lowest priority
		Behavior b2 = new KnockBottles();
		Behavior b3 = new HearSound();
		Behavior b4 = new EndProgram(); //highest priority
		Behavior[] behaviors = {b1,b2,b3,b4};
		Arbitrator arby = new Arbitrator (behaviors);
		arby.start();
	}

}

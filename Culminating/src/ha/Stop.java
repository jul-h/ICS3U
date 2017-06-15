package ha;


import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;

public class Stop implements Behavior {
	/**
	 * Takes control of the robot when the escape button is pressed down.
	 */
	public boolean takeControl(){
		if(Button.ESCAPE.isDown()){
			return true;
		}
		return false;
	}
	public void suppress(){
		
	}
	public void action(){
		System.exit(0);
	}	
}

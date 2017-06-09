package ha;


import lejos.nxt.Button;
import lejos.robotics.subsumption.Behavior;

public class Stop implements Behavior {

	public boolean takeControl(){
		return Button.ESCAPE.isDown();
	}
	public void suppress(){
		
	}
	public void action(){
		System.exit(0);
	}	
}

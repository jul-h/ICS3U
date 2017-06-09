import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.util.Delay;

/**
 * P3Rotation.java
 * 
 * @author Julie Ha
 * @author Sheila Noriega
 */
public class P3Rotation {

	public static void main(String[] args) {
		System.out.println("Program 3");
		Button.waitForAnyPress();
		Motor.A.setSpeed(360);
		Motor.A.forward();
		Delay.msDelay(4000);
		int angle = Motor.A.getTachoCount();
		System.out.println(angle);
		Motor.A.rotateTo(0);
		angle = Motor.A.getTachoCount();
		Button.waitForAnyPress();
	}

}

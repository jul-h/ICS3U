import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.util.Delay;

/**
 * P5MotorSpeed.java
 * 
 * @author Julie Ha
 * @author Sheila Noriega
 */
public class P5MotorSpeed {

	public static void main(String[] args) {
		System.out.println("Program 5");
		Motor.A.setSpeed(720);
		Motor.C.setSpeed(720);
		Motor.A.forward();
		Motor.C.forward();
		
		for (int i = 0; i < 8; i++){
			Delay.msDelay(200);
			int angleA = Motor.A.getTachoCount();
			int angleC = Motor.C.getTachoCount();
			System.out.println("A:" + angleA + " C:" + angleC);
			Button.waitForAnyPress();
		}
	}

}

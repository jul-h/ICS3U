import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class P4Rotation2 {

	public static void main(String[] args) {
		System.out.println("Program 4");
		Motor.A.setSpeed(360); 
		Motor.A.backward();
		int angle;
		//not finished
		if (Button.ENTER.isPressed()){
			Motor.A.stop();
			angle = Motor.A.getTachoCount();
			System.out.println(angle);
			Button.waitForAnyPress();
		}
		else {
		Delay.msDelay(4000);
		angle = Motor.A.getTachoCount();
		System.out.println(angle);
		Button.waitForAnyPress();
		}
	}

}

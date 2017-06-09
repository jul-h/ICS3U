import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.util.Delay;

public class P2Tachometer {

	public static void main(String[] args) {
		System.out.println("Program 2");
		Motor.A.setSpeed(720);
		Motor.A.forward();
		Delay.msDelay(2000);
		int angle = Motor.A.getTachoCount();
		System.out.println(angle);
		Motor.A.stop();
		angle = Motor.A.getTachoCount();
		System.out.println(angle);
		while (angle > 0){
		Motor.A.backward();
		}
		angle = Motor.A.getTachoCount();
		System.out.println(angle);
		Motor.A.stop();
		angle = Motor.A.getTachoCount();
		System.out.println(angle);
		Button.waitForAnyPress();
		Motor.A.stop();
	}

}

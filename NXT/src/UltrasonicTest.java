import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;

public class UltrasonicTest {

	public static void main(String[] args) {
		UltrasonicSensor hedgehog = new UltrasonicSensor(SensorPort.S1);
		Motor.A.forward();
		Motor.C.forward();
		int distance = 0;
		while(distance != 25){
		distance = hedgehog.getDistance();
		System.out.println(distance);
		}
		Motor.A.stop();
		Motor.C.stop();
		Button.waitForAnyPress();
	}

}

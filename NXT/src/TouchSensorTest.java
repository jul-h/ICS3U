import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;

public class TouchSensorTest {

	public static void main(String[] args) {
		TouchSensor touch = new TouchSensor (SensorPort.S1);
		while (!touch.isPressed()) {
			Motor.A.forward();
			Motor.C.forward();
		}
		Motor.A.backward();
		Motor.C.backward();
		Button.waitForAnyPress();
		

	}

}

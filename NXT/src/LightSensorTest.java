import lejos.nxt.SensorPort;
import lejos.nxt.Button;
import lejos.nxt.LightSensor;
import lejos.nxt.Motor;


public class LightSensorTest {

	public static void main(String[] args) {
		LightSensor light = new LightSensor (SensorPort.S1);
		int lightNum = 0;
		
		while (lightNum < 2){
			Motor.A.forward();
			Motor.C.forward();
			lightNum = light.getLightValue();
			System.out.println(lightNum);
		}
		Motor.A.stop();
		Motor.C.stop();
		Button.waitForAnyPress();

	}

}

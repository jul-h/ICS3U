import lejos.nxt.Button;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;

public class SoundSensorTest {

	public static void main(String[] args) {
		SoundSensor sound = new SoundSensor (SensorPort.S4, true);
		int soundLevel = 0;
		
		while (soundLevel < 75){
			Motor.A.forward();
			Motor.C.forward();
			soundLevel = sound.readValue();
			System.out.println(soundLevel);
		}
		Motor.A.stop();
		Motor.C.stop();
		Button.waitForAnyPress();
	}

}

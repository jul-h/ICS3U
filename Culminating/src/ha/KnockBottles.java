package ha;

import lejos.nxt.LightSensor;
import lejos.nxt.Motor;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;
import lejos.robotics.subsumption.Behavior;
import lejos.util.Delay;

public class KnockBottles implements Behavior {

	private boolean suppressed = false;
	@Override
	public boolean takeControl() {
		LightSensor light = new LightSensor (SensorPort.S2);
		if (light.getLightValue() > 40)
			return true;
		return false;
	}

	@Override
	public void suppress() {
		suppressed = true;
	}

	@Override
	public void action() {
		UltrasonicSensor ultra = new UltrasonicSensor(SensorPort.S1);
		int distance = 0;
		while (distance != 23){
			distance = ultra.getDistance();
			Motor.A.backward();
			Motor.C.backward();
		}
		Motor.A.rotate(180, true);
		Motor.C.rotate(-180, true);
		Delay.msDelay(1000);
		
		Motor.B.setSpeed(1080);
		Motor.B.rotate(60);
		Delay.msDelay(500);
		Motor.B.rotate(-60);
		Delay.msDelay(500);
		
		Motor.A.rotate(-140, true);
		Motor.C.rotate(140, true);
		Delay.msDelay(1000);
		
	}

}

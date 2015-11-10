package Sensor;

import lejos.hardware.port.Port;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;

public class ColorSensor extends EV3ColorSensor implements Sensor {

	private SensorMode mode = this.getMode(2);

	/**
    *
    * @return
    */
	public ColorSensor(Port port) {
		super(port);
	}

	/**
    *
    * @return
    */
	public float[] getValue() {
		float[] result = new float[mode.sampleSize()];
		mode.fetchSample(result, 0);
		return result;
	}

	/**
    *
    * @return
    */
	public float[] getRGB() {
		return this.getValue();
	}

	/**
    *
    * @return
    */
	public float getRed() {
		return this.getValue()[0];
	}

	/**
    *
    * @return
    */
	public float getGreen() {
		return this.getValue()[1];
	}

	/**
    *
    * @return
    */
	public float getBlue() {
		return this.getValue()[2];
	}
}
package hu.bme.mit.train.interfaces;

public interface TrainUser {

	int getJoystickPosition();

	boolean getAlarmFlag();

	boolean emergencyBreak();

	void overrideJoystickPosition(int joystickPosition);

}

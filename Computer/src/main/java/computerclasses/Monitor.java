package computerclasses;

import org.apache.logging.log4j.message.Message;

import interfacecomp.IOutput;

public class Monitor extends OutputDevice implements IOutput {

	Monitor(String a) {
		super(a);
	}

	private String screenType;

	float a = super.responseRate;

	public String getScreenType() {

		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	Message OutputDevice(String a) {

		responseRate = 0.5f; // protected variable from outputdevice class used

		System.out.println("Output device selected is " + super.getTypeOfOutput() + 
							" old responserate is " + super.responseRate + 
							" new response rate is " + responseRate + 
							" ScreenType is " + getScreenType());
		return null;
	}

	@Override
	public String displayOutput(String sy) {

		return sy;
	}

	@Override
	public void printPage() {
	}

	@Override
	public void playMusic() {
	}

}

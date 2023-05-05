package computerclasses;

import interfacecomp.InputInterface;

abstract class InputDevices implements InputInterface {

	protected InputDevices() {
		System.out.println("InputDevice Constructor");
	}

	public abstract  void handleKey(int key);

}

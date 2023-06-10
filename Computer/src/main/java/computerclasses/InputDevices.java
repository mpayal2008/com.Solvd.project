package computerclasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import interfacecomp.InputInterface;

abstract class InputDevices implements InputInterface {
	private static  Logger LOGGER = LogManager.getLogger(MainComputer.class);
	
	protected InputDevices() {
		LOGGER.info("InputDevice Constructor");
	}

	public abstract  void handleKey(int key);

}

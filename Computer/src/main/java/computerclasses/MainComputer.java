package computerclasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import types.Configurations;

import org.apache.commons.lang3.StringUtils;

public class MainComputer {

	private static  Logger LOGGER = LogManager.getLogger(MainComputer.class);

	public static void main(String[] args) throws Exception {

		LOGGER.info("\n\n------------CONNECTIVITY PORTS-----------\n");

/*		ConnectivityPorts cps = new ConnectivityPorts("Audio Jack");			 /// HASHMAP USED
		USB usb = new USB("Flash Drive ");
		usb.setSize(1000);
		usb.connectionType();
	
		PowerSupply poweroutlet = new PowerSupply("Power Supply");
		poweroutlet.isConnectionActive(false); 									// in PowerSupply class Arithmetic Exception

		try {
			AudioJack audiojack = null;
			audiojack.isConnectionActive(true);
		} catch (NullPointerException e) {
			LOGGER.error("NullPointerException handled"); 						// Try - Catch -- null pointer exception
		}

		Bluetooth bluetooth = new Bluetooth("B");
		bluetooth.setName("Apple");
		String name = bluetooth.getName();
*/
		LOGGER.info("\n\n------------Input Device-----------\n");

		Keyboard keyboard = new Keyboard();

		keyboard.handleKey(4); 													// Abstract method of super class

		if (keyboard.isConnected(true)) {
			keyboard.connect();
		} else {
			keyboard.disconnect();
		}

		String string = keyboard.setInputAction(); 								// string variable created to set as output display

/*		Mouse mouse= new Mouse();

		mouse.turnOn(true);
		mouse.setClickLeftPref(true);

		mouse.setInputAction();

		LOGGER.info("\n\n------------Output Device-----------\n");

		OutputDevice output = new Monitor("a");
		output.setTypeOfOutput("\nMonitor");

		Monitor monitor = new Monitor("a1");

		monitor.setScreenType("LED");
		monitor.setTypeOfOutput("Monitor");

		LOGGER.info(monitor.OutputDevice("Type"));							//Error- Printing previous logger message after this
		

*/		
		String upper = StringUtils.upperCase(string);
		LOGGER.info("Uppercase string: " + upper);						/// StringUtil method
		
		
/*		LOGGER.debug(monitor.displayOutput(upper));

		Printer print = new Printer("printer");
		print.printPage();

		LOGGER.info("\n\n------------HardDisk-----------\n");

		HardDisk hdisk = new HardDisk('i', true);
		int memSize = hdisk.getSize();
		System.out.println("HardDisk size is " + memSize);
		hdisk.setSize(100);
		memSize = hdisk.getSize();
		System.out.println("HardDisk size is " + memSize);
*/
		LOGGER.info("\n\n-----------------Types of computer package----------\n");

		Configurations head = new Configurations("Dell", 8, 512);						
		Configurations second = new Configurations("HP", 16, 1);
		Configurations third = new Configurations("Lenovo", 4, 256);

		head.setNext(second);
		second.setNext(third);

		Configurations current = head;
		while (current != null) {
			LOGGER.debug(
					"Brand: " + current.getBrand() + " RAM: " + current.getRAM() + " Storage: " + current.getStorage());
			current = current.getNext();
		}

/*		LOGGER.info("\n\n---------Comp Assembly---------------\n");
		MainComputerAssembly m1 = new MainComputerAssembly();						 // PROTECTED METHOD CALLED FROM OTHER PACKAGE
		LOGGER.debug(m1.add(10));

		FinalClassCheckPort cp1 = new FinalClassCheckPort();						 // FINAL CLASS CALLED
		LOGGER.debug(cp1.isOn(true));
*/
	}

}

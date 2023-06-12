package computerclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import interfacecomp.IConnection;

//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;

//import javax.swing.JFrame;

public class Keyboard extends InputDevices implements IConnection {

	/*
	 * Keyboard(int key){ JFrame myJFrame = new JFrame();
	 * 
	 * myJFrame.addKeyListener(new KeyAdapter() { public void keyPressed(KeyEvent
	 * key) { int keyCode = key.getKeyCode(); String txt =
	 * KeyEvent.getKeyText(keyCode); System.out.println("Key Entered is "+
	 * txt+" and Key code is "+ keyCode);
	 * 
	 * } }); myJFrame.setVisible(true); }
	 */

	public void handleKey(int key) {
		System.out.println("\nHandleKey method called for Keyboard Key: " + key);
	}

	@Override
	public String setInputAction() {

		System.out.println("\nEnter data");
		Scanner sc = new Scanner(System.in);
		//String st = sc.next();
		String name= "";
		name+=sc.nextLine();
		sc.close();
		return name;
	}

	@Override
	public void disconnect() {
		System.out.println("\nKeyboard disconnected");

	}

	@Override
	public boolean isConnected(boolean t) {
		return t;
	}

	@Override
	public void connect() {

	}

	@Override
	public void connectionType() {
		
		System.out.println("\nInput ConnectionType Keyboard");
	}

}

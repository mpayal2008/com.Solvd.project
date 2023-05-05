package computerclasses;

import interfacecomp.IConnection;

public class USB extends ConnectivityPorts implements IConnection {

	private String usb;
	private int size;

	protected USB(String device) {

		super(device);
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	@Override
	public boolean isConnected(boolean t) {
		return false;
	}

	@Override
	public void connect() {
	
	}

	@Override
	public void disconnect() {
		
	}

	@Override
	public void connectionType() {

	}

}

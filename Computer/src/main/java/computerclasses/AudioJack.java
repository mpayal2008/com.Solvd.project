package computerclasses;

import interfacecomp.IConnectivityPort;

public class AudioJack  extends ConnectivityPorts implements IConnectivityPort{
	
protected AudioJack(String device) {
		super(device);
		
	}


private float jackType = 3.5f;

	
	

	@Override
	public boolean isConnectionActive(boolean status) {
		
		return false;
	}


	@Override
	public void setPortData() {
		
		
	}


	@Override
	public void getPortData() {
	
		
	}



}

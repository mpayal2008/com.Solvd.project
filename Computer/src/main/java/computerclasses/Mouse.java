package computerclasses;

import interfacecomp.OnOffStatusInterface;

public class Mouse extends InputDevices implements OnOffStatusInterface {
	
	private Boolean clickLeftPref;
	protected int noOfKeys;
	

	public Boolean getClickLeftPref() {
		if(clickLeftPref= true) {
			
			System.out.println("\nMouse set for left click sensitivity");
		}else 
			System.out.println("\nMouse set for right click sensitivity");

		return clickLeftPref;
	}

	public void setClickLeftPref(Boolean clickLeftPref) {
		this.clickLeftPref = clickLeftPref;
	}



	@Override
	public String setInputAction() {								
		
		getClickLeftPref();
		return null;
		
	}

	@Override
	public void handleKey(int key) {

		System.out.println("\nHandleKey method called for Mouse Key.");
		
	}

	@Override
	public void turnOn(boolean t) {
		if(t= true)
		{
			System.out.println("\nMouse is on");
		}else
		{
			System.out.println("\nMouse is off");
		}
		
	}



}

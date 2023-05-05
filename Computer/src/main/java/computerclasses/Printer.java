package computerclasses;

import interfacecomp.IOutput;

public class Printer  extends OutputDevice implements IOutput{

	Printer(String a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayOutput(String st) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printPage() {
		System.out.println("/n/nprinter/n/n");
		
	}

	@Override
	public void playMusic() {
		// TODO Auto-generated method stub
		
	}

}

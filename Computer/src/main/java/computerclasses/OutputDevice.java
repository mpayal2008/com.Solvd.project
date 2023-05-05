package computerclasses;

public abstract class OutputDevice {

	private String typeOfOutput;
	protected float responseRate= 1.2f;
	
	
	public String getTypeOfOutput() 
	{
		
		return typeOfOutput;
	}
	
	public void setTypeOfOutput(String typeOfOutput) 
	{
		this.typeOfOutput = typeOfOutput;
	}

	OutputDevice(String a)
	{

	}


}

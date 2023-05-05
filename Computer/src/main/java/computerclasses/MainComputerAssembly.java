package computerclasses;

import types.Types;

public class MainComputerAssembly extends Types {

	public static int a=10;
	int j=10;
	
	public static int add( int b) 
	{
		int add = a+b;
		return add;
	}
	
	static {
		System.out.println("STATIC BLOCK CALLED FROM MAIN COMP ASSEMBLY");
	}
}	
	

	
		
	
	


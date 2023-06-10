package computerclasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import interfacecomp.IStorageSpaceRemaining;
import types.TypesOfComputers;

public class MainSalePriceCalculation {
	
	private static  Logger LOGGER = LogManager.getLogger(MainSalePriceCalculation.class);
	
	public static void main(String[] args) {
	
		TypesOfComputers types = null;													//	ENUM DATATYPE CALLED
	  
	    for(TypesOfComputers type:types.values()) {
	    	 LOGGER.info(type.gettype());
	    }
	    
	    IStorageSpaceRemaining subtraction=( a,  b) -> (a - b);   						// Lambda function 
        LOGGER.info("Storage space left is "+ spaceLeft(1000 , 230, subtraction)); 
        
	}

	private static int spaceLeft(int a, int b, IStorageSpaceRemaining IStorageSpaceRemaining) {
		// TODO Auto-generated method stub
		return IStorageSpaceRemaining.spaceLeft(a,b);
	}

	}



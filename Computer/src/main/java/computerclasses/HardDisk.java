package computerclasses;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HardDisk  {

private static  Logger LOGGER = LogManager.getLogger(Computer.class);
	
	
private char type;
protected int size;
private boolean isInternal;

HardDisk(char tp, boolean isInt){
	size = 0;
	type = tp;
	isInternal = isInt;
	LOGGER.info("HardDisk Constructor called");
}
public char getType() {
	return type;
}
public void setType(char type) {
	this.type = type;
	
}

public void setSize(int size) throws Exception {
	
	if(size>200 && size<=1000)
	{
		this.size = size;
		LOGGER.info("vaild");
	}
	else {
		LOGGER.info("Invalid Size. Valid Range is 200-1000");
	//	throw new Exception ("Invalid Size. Valid Range is 200-1000");		///THROW EXCEPTION
		
	}
}
public int getSize() {
	return size;
}
public boolean isInternal() {
	return isInternal;
}
public void setInternal(boolean isInternal) {
	this.isInternal = isInternal;
}

}

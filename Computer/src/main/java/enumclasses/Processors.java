package enumclasses;

public enum Processors {
	
	    INTEL("Core i7",8),
	    APPLE("M1 Max",10),
	    QUALCOMM("Snapdragon 888", 8),
	    NVIDIA("Jetson Xavier", 8);
	    
	    private final String name;
	    private final int speed;
	    
	    Processors(String name, int speed){
			this.name = name;
			this.speed = speed;
	    }
	   
	    public String getName() {
	        return name;
	    }
	    
	    public double getSpeed() {
	        return speed;
	    }
	 
	}
	
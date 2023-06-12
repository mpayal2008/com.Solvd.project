package enumclasses;

public enum OperatingSystem {

	    WINDOWS("Microsoft"),
	    MACOS("Apple"),
	    LINUX("Open Source"),
	    ANDROID("Google"),
	    IOS("Apple");
	    
	    private final String manufacturer;
	 
	    
	    OperatingSystem(String manufacturer) {
	        this.manufacturer = manufacturer;
	    }
	    
	    public String getManufacturer() {
	        return manufacturer;
	    }
	    
	}

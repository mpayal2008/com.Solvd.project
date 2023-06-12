package types;

public enum TypesOfComputers {
	LAPTOP("Laptop"),
	DESKTOP("Desktop");
	
    private final String type;


    TypesOfComputers(String string) {
		this.type = string;
		
	}
    public String gettype() {
    	return type;
    }
	
}

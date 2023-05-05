package types;

public class Configurations {
	
	    private String brand;
	    private int RAM;
	    private int storage;
	    private Configurations next;

	    public Configurations(String brand, int RAM, int storage) {
	        this.brand = brand;
	        this.RAM = RAM;
	        this.storage = storage;
	        this.next = null;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public int getRAM() {
	        return RAM;
	    }

	    public int getStorage() {
	        return storage;
	    }

	    public void setNext(Configurations next) {
	        this.next = next;
	    }

	    public Configurations getNext() {
	        return next;
	    }
	}
	


package enumclasses;

public enum InternalStorageSpace {
	
	SSD1,
	SSD2,
	HDD1,
	HDD2;
	
	void printStorage() {
		switch(this) {
		case SSD1: 
		case SSD2:
		case HDD1:
		case HDD2:
		default:
		}
	}
}

package interfacecomp;

public interface IConnectivityPort {
	
	public static final int a = 0;
	
	boolean isConnectionActive(boolean status);
	
	void setPortData();
	
	void getPortData();


	 
}

package computerclasses;

import interfacecomp.IConnectivityPort;

public class PowerSupply extends ConnectivityPorts implements IConnectivityPort{


	protected PowerSupply(String device) 
	{
		super(device);
	}

	@Override
	public boolean isConnectionActive(boolean status) {
		if(status==false)
		{
			try {
				
				System.out.println(9/0);					//Exception
															//try --- catch
				} catch(ArithmeticException e) {
					System.out.println(e);
				}
				finally{
					System.out.println("Finally block executed");
					
				}
				
			} else
			{
				return true;
			}
	
		
		return status;
	}

	@Override
	public void setPortData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPortData() {
		// TODO Auto-generated method stub
		
	}

	
	
}

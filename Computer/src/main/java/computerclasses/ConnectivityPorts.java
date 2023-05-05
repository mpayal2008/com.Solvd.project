package computerclasses;


import java.util.HashMap;
import java.util.Map;


public class ConnectivityPorts  {
	
	protected ConnectivityPorts(String device)
	{
		Map<Integer, String> dev1= new HashMap<>();
		dev1.put(1311, "Power Supply");
		dev1.put(3030,  "USB");
		dev1.put(2121,  "Audio Jack");
		dev1.put(2389,  "HDMI");
		  
        if (dev1.containsValue(device)) {
            for (Map.Entry<Integer,String> e : dev1.entrySet()) {
                Integer key = e.getKey();
                Object value2 = e.getValue();
                if ((value2.toString()).equalsIgnoreCase(device)) {
                   System.out.println("Port no for "+device+" is "+key);
                }
            }
        }	
	}
}

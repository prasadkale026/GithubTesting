package Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Table3 {
	public static void main(String[]args) {
		
		HashMap<Integer,String> table=new HashMap<Integer,String>();
		
	    table.put(34, null);
	    table.put(null, "Pune");
	    table.put(36, null);
	    table.put(78, "Hyderabad");
	    table.put(23, "Noida");
	    
	    for(Map.Entry<Integer, String> f :table.entrySet()) {
	    	System.out.println("Key"+ f.getKey()+ " Value "+f.getValue());
	    	
	    }
	}}




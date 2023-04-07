package Collection;

import java.util.Hashtable;
import java.util.Map;

public class Table {
	
	public static void main(String[]args) {
	
	Hashtable<Integer,String> table=new Hashtable<Integer,String>();
	
    table.put(34, "Mumbai");
    table.put(24, "Pune");
    table.put(78, "Hyderabad");
    table.put(23, "Noida");
    table.put(24, "Banglore");  // manager did change	
    
    for(Map.Entry<Integer, String> f :table.entrySet()) {
    	System.out.println("Key"+ f.getKey()+ " Value "+f.getValue());
    	
    }
}}

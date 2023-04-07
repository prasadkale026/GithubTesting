package Collection;

import java.util.HashSet;

public class HashSet2 {
	
	public static void main(String[]args) {
		
		HashSet set =new HashSet();
		
		set.add("sidgfh");
		set.add('%');
		set.add(1234);
		set.add(null);
		
		System.out.println(set);
		
		for(Object f : set) {
			System.out.println(f);
		}
		

}}

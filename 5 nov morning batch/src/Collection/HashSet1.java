package Collection;

import java.util.HashSet;

public class HashSet1 {
	
	public static void main(String[]args) {
		
		// insertion order not maintain or RANDOM
		
		HashSet<Character>set =new HashSet<Character>();
		
		set.add('#');
		set.add('%');
		set.add('*');
		set.add('@');
		set.add('$');
		
		for(char s :set) {
			System.out.println(s);
		}
		
	}

}

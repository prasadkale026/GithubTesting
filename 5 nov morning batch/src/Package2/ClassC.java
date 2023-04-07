package Package2;

import Package1.ClassA;

public class ClassC {
	
	public static void main (String[]args) {
		
		ClassA x =new ClassA ();
		
		
		System.out.println(x.a) ;  // calling variable with public access specifier
	//	System.out.println(x.b) ;  // private no access (Out of scope)
	//	System.out.println(x.c) ;  // protected No access (Out of scope)
	//	System.out.println(x.d) ;  // Default No access (Out of scope)
		
	}

}

package Package1;

public class ClassB {
	
	public static void main(String[]args) {
		
		ClassA  z =new ClassA ();
		
		System.out.println(z.a);   // calling variable with public access modifier
	 //	System.out.println(z.b);   //  cant call from another class
		System.out.println(z.c);   //  calling variable with protected access modifier
		System.out.println(z.d);    // calling variable with default access modifier
		
				
				
	}

}

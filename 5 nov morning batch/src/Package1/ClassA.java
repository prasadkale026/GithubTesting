package Package1;

public class ClassA {
	
	public int a= 70;
	
	private int b= 90 ;
	
	protected int c = 50 ;
	
	int d =35 ;  // default
	
	public static void main(String[]args) {
		
		ClassA x =new ClassA () ;
		
		
		System.out.println(x.a);  // calling variable with public specifier
		System.out.println(x.b);  // calling variable with private specifier
		System.out.println(x.c);  // calling variable with protected specifier
		System.out.println(x.d);  // calling variable with default specifier
		
	}

}

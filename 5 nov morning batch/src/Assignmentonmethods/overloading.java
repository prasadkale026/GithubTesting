package Assignmentonmethods;

public class overloading {
	
	
	public void Addition (int a,int b) {
		
		System.out.println(a+b);
		
	}
	static void Addition () {
		
		System.out.println("hii");
		
		
		
	}
	
	public static void main(String[]args) {
		
		
		Addition ();
		
		
		overloading z= new overloading ();
		
		z.Addition(50, 40);
	}

}

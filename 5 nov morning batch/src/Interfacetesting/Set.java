package Interfacetesting;

public class Set implements Test {
	
	public void Define () { // complete method or incomplete method
		
		System.out.println("method Define is running");
		
	}
    
	public void setup () {
		
		System.out.println("method setup is running");
		
	}
	
	public static void main(String []args) {
		
		Set x=new Set ();  // object of implementation class
		x.setup();
		x.Define();
		
	}
}

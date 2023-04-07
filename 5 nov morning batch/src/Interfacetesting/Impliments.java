package Interfacetesting;

public class Impliments implements staticinterface {
	
	public void show () {
		System.out.println(" show method is running");
		
	
		
	}
	public static void main(String []args) {
		
		Impliments x =new Impliments ();
		x.show();
		
		staticinterface.Demo();// static method of interface
		
		
	}

}

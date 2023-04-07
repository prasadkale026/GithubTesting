package Inheritance;

public class Child1 extends Child {

	
	public void Cycle () {
		System.out.println("Cycle");
		
	}
	
	public static void main (String[]args) {
		
		Child1 z =new Child1 ();
		z.Home();
		z.Money();
		z.car();
		z.Bike();
		z.Cycle();
	}
}

package polymorphism;

public class Riding2 extends Riding {  // overriding
	
	public void Statement ( ) {
		
		System.out.println("method from subclass is running");
		
	}
	
	public static void main(String[]args) {
		
		Riding2  x=new Riding2 ();
		x.Statement();
		
		Riding y =new Riding2();
		y.Statement();

		
		
	}
}

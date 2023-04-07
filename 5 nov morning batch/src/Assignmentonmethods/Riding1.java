package Assignmentonmethods;

public class Riding1 extends Riding {
	
	public void Happy () {
		
		System.out.println("King");
		
		
	}
	public static void main(String[]args) {
		
		Riding1 w =new Riding1 ();
		
		w.Happy();
		
		Riding z =new Riding1 ();
		z.Happy();
	}

}

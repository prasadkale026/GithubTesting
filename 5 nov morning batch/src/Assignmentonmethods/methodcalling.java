package Assignmentonmethods;

public class methodcalling {
	
	
	
	public static void Demo () {
		
		System.out.println("Demo method us running");
		
	}
	public void Memo () {
		System.out.println("Memo method us running");
		
	}
	public static void  main(String[]args) {
		 
		Demo ();
		
		methodcalling x = new methodcalling();
		x.Memo();
						
		
	}

}

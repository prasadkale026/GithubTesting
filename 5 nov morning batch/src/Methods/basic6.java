package Methods;

public class basic6 {    // calling feom different class
	
	
	public static void main (String[]args) {
		
		
		basic5.Test();   //  static method call from different class
		
		
		basic5 x = new basic5() ;  //  object creation
		
		x.Demo();   //non static method call from different class
		
	}

}

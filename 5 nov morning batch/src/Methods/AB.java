package Methods;

public class AB {
	
	
		static void Test () { //the method name is test its return nothing
			
			System.out.println("a") ;
			System.out.println("b") ;
			System.out.println("c") ;
			
			
	}
		public static void main(String[]args) {
			
			Test ();
			System.out.println("d") ;
			
			Test () ;
			System.out.println("e") ;
			
			Test();
			System.out.println("f") ;
			
			Test ();
		}

}

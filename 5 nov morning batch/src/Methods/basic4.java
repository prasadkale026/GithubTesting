package Methods;

public class basic4 {   // non static method declare in same class and call in same class
	
	public static void Demo() {
		System.out.println("Demo method running");
		
	}
	public static void Test() {
		System.out.println("Test method is running");
		
	}
	
	public static void main (String[]args) {
		
		basic4 x =new basic4 ();
		
		x.Demo();//non static method calling  same class
		
		Test();  // static method calling same class
	}

}

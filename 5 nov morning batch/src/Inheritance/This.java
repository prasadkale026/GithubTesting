package Inheritance;

public class This {
	
	int a= 75;  // global variable
	
	public void Test () {
		
		int a= 58 ; //local variable
		
		System.out.println(a);  // local variable 58
		
		System.out.println(this.a);  // 75 global variable
		
	}
	
	public  void basic () {
		int a=23;  // local variable 
		
		System.out.println(a);   // local variable 23
		
		System.out.println(this.a);  // global 75
		
		
	}
	public static void main(String[]args) {
		
		This x =new This ();
		x.Test();
		x.basic();
	}

}

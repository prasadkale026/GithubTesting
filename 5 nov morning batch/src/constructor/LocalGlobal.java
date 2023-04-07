package constructor;

public class LocalGlobal {
	
	int a= 30 ; // Global variable 
	
	public void Test()  {
		
		int b = 78 ;  // Local variable
		
		System.out.println(b);  // calling local variable
		System.out.println(a) ;  // calling global variable
		
	}
	public void Demo () {
		
		int c=90 ;  // Local variable
		
		System.out.println(c);  //calling Local variable
		System.out.println(a);  // calling Global variable
	 //	System.out.println(b);  // local variable from another method cant be call
		
	}
	public static void main(String[]args) {
		
	LocalGlobal x =new LocalGlobal ();
	
	x.Test();
	x.Demo();
		
		
		
	}

}

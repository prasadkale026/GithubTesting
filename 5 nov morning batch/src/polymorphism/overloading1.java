package polymorphism;

public class overloading1 {
	
	public static void addition(int a,int b) {
		
		System.out.println(a+b);
		
	}
	public static void addition(int a,int b,int c) {
		
		System.out.println(a+b+c);
		
	}

	public static void main (String []args) {
		
		overloading1.addition(20, 30);    // calling with same class due to static method
		overloading1.addition(20, 40, 50);
	}
}

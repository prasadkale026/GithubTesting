package polymorphism;

public class overloading {
	
	public void Addition(int a,int b) {   // non static method
		
		System.out.println(a+b);
		
	}
	
	public void Multiplication (int a,int b,int c) {
		System.out.println(a+b+c);
		
		
	}
	public static void main(String[]args) {
		
		overloading x=new overloading();
		x.Addition(50, 40);
		x.Multiplication(10,20, 30);
	}
}


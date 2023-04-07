package Methods;

public class Argument {
	
	public  void Multiplication (int a, int b) {
		int c= a*b;
		System.out.println("Multiplication="+ c) ;
		
	}
	public static void Addition( ) {
		int a=80;
		int b=90;
		int c=a+b;
		System.out.println("Addition=" + c) ;
		
	}
	
	public static void main (String[]args) {
		Addition();
		
		Argument x = new Argument ();
		x.Multiplication(70, 86);
		x.Multiplication(40, 30);
		x.Multiplication(30, 21);
	}

}

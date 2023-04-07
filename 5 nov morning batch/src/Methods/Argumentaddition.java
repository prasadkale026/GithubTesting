package Methods;

public class Argumentaddition {
	
	public static void Addition (int a, int b) {   //static method with argument
		
		int c=a+b;
		System.out.println("Addition="+ c) ;
		
	}
	
	public static void main(String[]args) {
		
        Addition(40, 500);
		Addition (50,58);
		Addition(90,99);
	}


}

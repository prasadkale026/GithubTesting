package Exception;

public class TryCatch {
	
	public static void main(String[]args) {
		
		int a=20;
		int b=0;
		int c=0;
		
		try {
			
			System.out.println("Risky code");
			
			c=a/b;
		}
		
		catch (ArithmeticException e) {
			b=2;
			c=a/b;
			
			System.out.println("alternative code");
			
			
		}
		System.out.println(c);
	}

}

// Exception generated and not get handled
//Try block executed


//Exception generated and  get handled
//Try and catch block and normal flow

//Exception not generated
//Try and normal flow

//In case of finally block //

//Exception generated and not get handled
//try block and finally executed

//Exception generated and  get handled
//try block and catch block and finally block and normal flow

//Exception not generated
//try block and finally block and normal flow


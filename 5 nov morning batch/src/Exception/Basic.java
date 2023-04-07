package Exception;

public class Basic {
	
	static void Test() {
		
		throw new NullPointerException();

			
		}
		
		static void demo() {
			
			throw new ArithmeticException();
			
		}
		public static void main(String[]args) throws InterruptedException {
			int a=80;
			int b=0;
			int c=a/b;
			System.out.println(c);
			
			System.out.println("Main method running");
			
		//	demo();
			Test();
			
			Thread.sleep(4000);
			
		}
		}
		
	
	
	
	



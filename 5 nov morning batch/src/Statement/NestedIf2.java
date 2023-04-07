package Statement;

public class NestedIf2 {
	
	public static void main (String[]args) {
		
		String Email="xyz@123" ;
		String pass ="#567" ;
		
		if (Email=="xyz@456") {
			System.out.println("Email is correct") ;
			
			if(pass=="#567") {
				System.out.println("password is correct") ;
				System.out.println("Login is succesful ") ;
			}
			
				else {
					System.out.println("Incorrect password") ;
					System.out.println("Login is fail") ;
					
				}
		}
		
		else {
			System.out.println("Email is Incorrect") ;
			System.out.println("Login is Fail") ;
			
					
				
				
			
			
		}
	}

}

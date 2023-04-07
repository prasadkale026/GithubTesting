package Statement;

public class NestedIf1 {
	public static void main (String[]args) {
		
		String UN = "XYZ" ;
		String pass = "@123" ;
		
		if (UN=="XYZ") {
			System.out.println("correct user name") ;
			
		    if (pass=="@123") {
		    	System.out.println("correct password") ;
		    	System.out.println("log in succesful") ;
				
		    }
		    else {
		    	System.out.println("password is incorrect") ;
		    	System.out.println("login is failed") ;
		    }
		    
		    
		}
		else {
			System.out.println("Incorrect Username") ;
			System.out.println("LOgin failed") ;
			
			
		}
		    
		    
		    	
				
				
		    }
			
		
	}



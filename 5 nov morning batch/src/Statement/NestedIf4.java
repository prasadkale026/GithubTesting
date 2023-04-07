package Statement;

public class NestedIf4 {
	public static void main (String[]args) {
		
	  byte stdmarks = 25 ;
	  
	   if (stdmarks>35) {
		  System.out.println("std is pass ") ;
		  
		  if (stdmarks<35) {
			  System.out.println("std fail") ;
			  System.out.println("std can not go to next class") ;
			  
		  }
		  else {
			  System.out.println("std pass") ;
			  System.out.println("std can go to next class") ;
			  
		  }
		  
	   }
	   else {
		   System.out.println("std is fail") ;
		   System.out.println("std can not go to next class") ;
			
			  
				
				
				
				
		  }
			
	  }
	}



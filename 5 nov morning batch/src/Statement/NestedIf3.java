package Statement;

public class NestedIf3 {
	public static void main (String[]args) {
		
		byte stdage= 18 ;
		
		if (stdage > 18) {
			System.out.println("std eligible for work") ;
			
			if (stdage==18) {
				System.out.println("std is not eligible for work") ;
				System.out.println("std can not apply for gov job") ;
				
			}
				
				else {
					System.out.println("std is eligible for work") ;
					System.out.println("std can apply for gov job") ;
					
				
			}
			
		}
			else {
				System.out.println("std is not eligiblr for work") ;
				System.out.println("std can not apply for gov job") ;
				
				
			
		}
	}

	}

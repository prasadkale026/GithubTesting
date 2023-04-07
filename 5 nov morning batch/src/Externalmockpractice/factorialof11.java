package Externalmockpractice;

public class factorialof11 {
	
	
	public static void main(String[]args) {
		
		int num =11;
		int fact =1;
		
		for(int i=11;i>1;i--) {
			
			fact =fact *i ;
			
			
		}
		System.out.println("factorial of" + num + " is "+fact);
		//System.out.println(fact);
	}

}

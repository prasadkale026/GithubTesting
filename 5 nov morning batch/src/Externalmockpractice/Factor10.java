package Externalmockpractice;

public class Factor10 {
	
	public static void main(String[]args){
        int num =10;
	int fact =1;
	
	for(int i=10;i>1;i--) {
		
		fact =fact *i ;
		
		
	}
	System.out.println("factorial of" + num + " is "+fact);

}

}




package Externalmockpractice;

public class Pattern7 {
	
	public static void main(String[]args) {
	
	int star = 5;

	for(int i = 1; i <= 5; i++) {
         for (int j = 5; j > i; j--) {
		
			System.out.print(" ");
		}
		for (int k = 1; k <= i; k++) {
	    System.out.print(k + " ");
	   
		}
		System.out.println();
	}
}
}



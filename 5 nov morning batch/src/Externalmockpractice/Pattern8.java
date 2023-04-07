package Externalmockpractice;

public class Pattern8 {
	
	public static void main(String[]args) {
		
		int star=5;
		
		for(int i=5;i>=1;i--) {
			for (int j=1;j<i;j++) {
				System.out.print(" ");
			}
				
			for(int k=i;k<=star;k++){
				System.out.print(k+" ");
				
			}
				System.out.println();
				
			
			}
	}
}
	



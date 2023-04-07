package Externalmockpractice;

public class Pattern10 {
	
	public static void main(String[]args) {
		
		char star='E';
		
		for(char i='E';i>='A';i--) {
			for(char j='A';j<i;j++) {
				System.out.print(" ");
				
			}
			for(char k=i;k<='E';k++)
				System.out.print(k+" ");
			System.out.println();
			
		}
	}

}

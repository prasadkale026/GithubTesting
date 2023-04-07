package Externalmockpractice;

public class Pattern5 {
	
	public static void main (String []args) {
		
		char star= 'A';
		
		for(char i ='A'; i<='E';i++) {
			for(char j='E';j<star;j--) {
				System.out.print(" ");
				
			}
			for(char k='A';k<=i;k++)
			System.out.print(i+" ");
			System.out.println();
			
				
		}
	}

}

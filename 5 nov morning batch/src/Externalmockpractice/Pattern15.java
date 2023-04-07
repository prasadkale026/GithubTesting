package Externalmockpractice;

public class Pattern15 {
	
	public static void main(String[]args) {
		
		int star=1;
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=star;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
			star++;
		}
	}

}

package LogicalProgram;

public class Print1to100primenumber {

	public static void main(String[]args) {
		
		
		
		int count ;
		//System.out.println("prime number");
		for(int i=2;i<=100;i++) {
			count =0;
			
		
			
			for(int j=2;j<=i/2;j++) {
				
				if(i%j==0) {
					count++;
				}
		//	System.out.print(i+" ");
		}
		if(count==0) {
				System.out.println(i);
			}
	}

	}}

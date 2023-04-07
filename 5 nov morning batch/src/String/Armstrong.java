package String;

public class Armstrong {
	
	public static void main(String[]args) {
		
		int orig = 153;  // 1+ 125 +27 = 153
		
		int add =0;
		
		for(int i=orig;i>0;i= i/10) {
			
			int remainder = i% 10;
			
			add =add + (remainder*remainder*remainder);
		//System.out.println(add);
		}
		if(orig==add) {
			System.out.println("Given number is Armstrong ");
			
		}
		else {
			System.out.println("Given number is not Armstrong");
		}
	}

}

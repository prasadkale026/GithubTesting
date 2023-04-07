package String;

public class Whitespace { // duplicate character in given String
	
	public static void main(String[]args) {
		
		String b ="abbbbs dfgh kdjif jjjj ka";
		int total=0;
	
		
		for(int i=0;i<=b.length()-1;i++) {
			
			char p = b.charAt(i);
			//System.out.println(p);
		
			if (p==' ') {
				total++;
			}
		}
			
	    System.out.println(total);
	}}
	

	     
	




package String;

public class Basic {
	
	public static void main(String[]args) {
		
		String a ="velocity";
		
		String b ="velocity";
		
		String c= new String ("prasad");
		
		String d = new String ("kale");
		
		System.out.println(a==b); //true
		
		System.out.println(c==d); // false
		
		System.out.println(a==c);//false
		
		System.out.println("***********************");
		
		b="shivraj";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b); //false
		
		System.out.println("************************");
		b="velocity";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);//true
		
		
		
	}

}

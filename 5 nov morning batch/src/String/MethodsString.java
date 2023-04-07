package String;

public class MethodsString {
	
	
	public static void main (String[]args) {
		
		String a1 = "prasad";
		String a2 = "shivraj";
		String a3 = "";
		String a4 = "vishnu....u....vivek";
		String a6 = "";
		String a5 = "PRASAD";
		System.out.println(a1.charAt(3)); // to print character at any index
		System.out.println(a2.replace("i", "e")); //to replace old character to new 
		System.out.println(a3.isEmpty());
		System.out.println(a1.concat(a4)); // to combine two Strings
		System.out.println(a1.substring(2));
		System.out.println(a1.substring(2, 4));
		System.out.println(a4.startsWith("v"));
		System.out.println(a3.endsWith(""));
		System.out.println(a4.indexOf("u"));
		System.out.println(a4.lastIndexOf("u"));
		System.out.println(a4.length());
		System.out.println(a2.contains("v"));
		System.out.println(a3==a6);
		System.out.println(a6.equals(a3));
		System.out.println(a1.equalsIgnoreCase(a5));
		System.out.println(a1.toUpperCase());
		System.out.println(a5.toLowerCase());
		
		String c= String.join(a1,a3,a4);
		System.out.println(c);
		
		String []result = a2.split("h");
		for(int i=0;i<=result.length;i++) {
			System.out.println(result[i]);
		}
		
	
	}
}

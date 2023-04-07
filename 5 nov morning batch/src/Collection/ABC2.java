package Collection;

public class ABC2 <G,L> {
	
	G b;
	
	G Demo(L x) {
		
		System.out.println(x);
		return b;
		
	}
	public static void main(String[]args) {
		
		ABC2 <Integer,String> y =new ABC2 <Integer,String> ();
		
		y.b=890;
		
		int z=y.Demo("Automation");
		
		System.out.println(z);
		
	}

}

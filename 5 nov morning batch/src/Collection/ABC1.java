package Collection;

public class ABC1 <G>{
	
	int a ;
	G b ;
	
	public static void main(String[]args) {
		
		ABC1 <Integer> x =new ABC1 <Integer>();
		x.a=78;
		
		x.b=67;
		System.out.println(x.b);
		
		ABC1 <String> y =new ABC1 <String>();
		
		y.b="Automation";
		System.out.println(y.b);
		
	}

}

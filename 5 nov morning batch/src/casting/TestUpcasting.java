package casting;

public class TestUpcasting {
	
	public static void main(String[]args) {
		
		System.out.println("*******super class methods *******");
		
		Upcasting x=new Upcasting ();
		x.set();
		x.Demo();
		x.staticcast();
		
		
		System.out.println("*******Subclass methods *******");
		
		Upcast1 y =new Upcast1();
		y.Demo();
		y.set();
		y.Subclass();
		y.staticcast();
		
		
		System.out.println("*******casting methods********");
		
		Upcasting z=new Upcast1 ();
		z.Demo();
		z.set();
		z.staticcast();
		
		
		Upcast1  up =(Upcast1)new Upcasting ();
		up.Demo();
		up.set();
		up.Subclass();
		up.staticcast();
		
		
		
		
		
		
		
	}

}

package polymorphism;

public class TestMethodHide extends MethodHide{
	
	public static void Demo () {
		
		System.out.println("sub class demo method is running");
		
	}
	
	public static void main(String[]args) {
		
		TestMethodHide x= new TestMethodHide();
		
		x.Demo();
		
		
	}
}

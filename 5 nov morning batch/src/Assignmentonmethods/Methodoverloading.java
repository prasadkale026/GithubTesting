package Assignmentonmethods;

public class Methodoverloading {
	
	public void Demo () {
		
		System.out.println("abcde");
		
	}
	
	public void Demo (int a,int b) {
		int c=a+b;
		System.out.println(c);
		
		
		
	}
	public static void main(String[]args) {
		
		Methodoverloading x =new Methodoverloading();
		
		x.Demo();
		x.Demo(40, 50);
		
		
	}

}

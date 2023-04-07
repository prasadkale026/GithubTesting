package Interfacetesting;

public class TestDefault implements Default {
	
	public void show() {
		
		 System.out.println("show mthod from interface ");
		 
	}
	
	public  void Mart() {
		 System.out.println("xyz is running ");
		 
	
	}
	public static void main(String[]args) {
		
		TestDefault y=new TestDefault();
		y.Mart();
	}

}

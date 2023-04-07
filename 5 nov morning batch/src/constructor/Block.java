package constructor;

public class Block {
	
	// non static block
	
	{
		System.out.println("Non-static Block is running");
	}
	
	public static void main(String[]args) {
    	System.out.println("Main method is running");
    	Block x =new Block();
		
		
		
	}
	// static Block
	static {
		
		System.out.println("Static Block is running");
	}

}

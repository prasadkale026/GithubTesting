package Interfacetesting;

public interface Default {
	
	// Default method of interface
	//Default is a keyword not access specifier
	//xyz method is by default public
	
	
 public	default void Mart () {
	 System.out.println("method from interface ");
	 
	 
		
	}
     public static void XYZ () {  //complete static method
    	 System.out.println(" Test method from interface ");
     }
     
     public void show();
}

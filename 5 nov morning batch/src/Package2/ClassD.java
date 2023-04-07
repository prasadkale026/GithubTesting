package Package2;

import Package1.ClassA;

public class ClassD extends ClassA{  // Using inheritance
    
	public static void main(String[]args) {
		
	  ClassD y =new ClassD ();
	  
	  System.out.println(y.a) ;  //public
	  System.out.println(y.c) ;  // Protected can be access because of inheritance
	}
}

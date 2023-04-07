package LogicalProgram;

import java.util.Scanner;

public class Scan1 {
	
	public static void main(String[]args) {
		
		Scanner demo = new Scanner(System.in) ;
		
		System.out.println("Enter the short : ") ;
		
		short value = demo.nextShort();
		System.out.println("You entered value is : " + value ) ;
		System.out.println() ;
		
		System.out.println("Enter the double : ") ;
		
		double value1= demo.nextDouble();
		System.out.println("You entered value is:" + value1) ;
		System.out.println() ;
		
		System.out.println("Enter the byte : ") ;
		
		byte value2 = demo.nextByte();
		System.out.println("You entered value is : " + value2) ;
		System.out.println() ;
		
		System.out.println("Enter the boolean : ") ;
		
		boolean value3 = demo.nextBoolean();
		System.out.println("You entered value is:" + value3) ;
		System.out.println() ;
	}

}

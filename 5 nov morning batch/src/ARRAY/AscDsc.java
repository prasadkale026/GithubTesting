package ARRAY;

import java.util.Arrays;

public class AscDsc {
	
	public static void main(String[]args) {
		
		int a[]= {10,35,20,60,56,48}; // declarartion of array
		
		int size =a.length-1;
		System.out.println(size);
		
		System.out.println("******All Info Array*******");
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);	
			
		}
		Arrays.sort(a);
		System.out.println("******** All  Info in Ascending  ********");
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
			
		}
		
		System.out.println("********* Info in Descending ********");
		
		for (int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}

		
		
	}

}

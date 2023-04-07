package JAVABasics;

public class DataType2 {

	public static void main (String[]args) {
		
		boolean stdpass =false;  //conditional DT only TRUE or FALSE output
		
		byte stdMxMarks=100;  //values from -128 to 127 use byte instead of int to save the memory
		
		short totalmarks=500;  //value from -32768 to 32767
		
		int rollNumber =55657;  //greater then short DT range
		
		long mobileNumber =9898987654L;  //L is manadatory when we use long
		
		double stdAvgmarks =567.2222222666655544488956;  //fractional upto 15 digit 
		
		float stdPercentage =78.98f; //f  is manadatory
		
		char stdGrade = 'A' ;
		
		System.out.println(stdpass);
		System.out.println(stdMxMarks);
		System.out.println(totalmarks);
		System.out.println(rollNumber);
		System.out.println(mobileNumber);
		System.out.println(stdAvgmarks);
		System.out.println(stdPercentage);
	}
	
}

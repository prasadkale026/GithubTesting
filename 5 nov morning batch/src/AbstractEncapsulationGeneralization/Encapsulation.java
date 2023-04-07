package AbstractEncapsulationGeneralization;

public class Encapsulation {
	
	private int a=50;
	
	private int b=20;
	
	Encapsulation (){
		
		a=85;
		b=60 ;
		
	}
	Encapsulation (int c,int d){
		
		a=c;
		b=d;
		
		
	}
	public void Demo () {
		int c=a+b;
		System.out.println(c);
		
	}
	public static void main(String[]args) {
		
		Encapsulation x = new Encapsulation ();
		
		x.Demo();
		
		
	}

}

package constructor;

public class StatNonStat {
	
	static int a=10; // static variable
	int b=20; // non static variable
	float c=50.660f ;
	
	public static void main(String[]args) {
		System.out.println(" static variable  ="+ a);  
		
		StatNonStat x = new StatNonStat();
		System.out.println("Non- static variable with ref of x ="+x.b);   //20
		
		
		StatNonStat y =new StatNonStat();
		System.out.println(" Non-static variable with ref of y  ="+ y.b) ;  //20
		
		x.b =30 ;
		System.out.println("Non- static variable with ref of x ="+x.b);   //30
		System.out.println("Non- static variable with ref of y ="+y.b);   //20
		
		System.out.println("Non- static variable with ref of x ="+x.a);   //20
		System.out.println("Non- static variable with ref of y ="+y.a);   //20
		
		x.a=50;
		System.out.println("Non- static variable with ref  x updated ="+x.a);    //50
		System.out.println("Non- static variable with ref  y  updated="+y.a);   // 50
		
	}
	

}

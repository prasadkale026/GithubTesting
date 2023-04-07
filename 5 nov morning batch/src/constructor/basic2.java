package constructor;

public class basic2 {  // user define constructor with parameter and without paremeter
	
	int a;
	int b;
	int m;
	String name;
	String velocity;
	
	basic2 () { //  UD constructor without parameter
		
		a=78;
		b=68;
		
	}
	
	basic2 (int c ,int d) {  //  UD constructor with parameter
		
		a=c;
		b=d;
		
	}
	basic2 (int c, int d,int i) {  // UD constructor with parameter
		
		a=c;
		b=d;
		m=i;
		
	}
	public void Addition () {
		System.out.println(m+a+b);
		
		
	}
	public static void main(String[]args) {
		basic2 x =new basic2 ();
		
     x.Addition();
		
      basic2 y =new basic2(50,60);
      y.Addition();
      
      basic2 z=new basic2(10,20,30);
	 z.Addition();
	}
	
	

}

package AbstractEncapsulationGeneralization;

public class TestGeneralization {
	
	
	public static void main(String[]args) {
	System.out.println("******* specification for Jio ********");	
		Jio x =new Jio ();
		x.Audiocalling();
		x.Textmessage();
		x.Internet();
		
		System.out.println("******* specification for VI ********");
		VI y=new VI ();
		y.Audiocalling();
		y.Textmessage();
		y.Internet();
		y.Newfeature();
		
		System.out.println("******* specification for BSNL ********");
		BSNL z=new BSNL ();
		z.Audiocalling();
		z.Textmessage();
		z.Internet();
		
	}

}

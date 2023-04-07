package Collection;

import java.util.ArrayList;

public class AllCollection {
	
	public static void main(String[]args) {
		
		ArrayList <Integer>list =new ArrayList <Integer>();
		
		list.add(123);
		list.add(456);
		list .add(890);
		list.add(12345);
		
		int size =list.size();
		System.out.println(size);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("*******************************");
		
		list.remove(2);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			
		}
	}

}

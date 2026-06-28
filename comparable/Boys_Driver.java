package comparable;

import java.util.Arrays;

public class Boys_Driver {
	public static void main(String[] args) {
		Boys b[]= {
				new Boys(25,"Magesh"),
				new Boys(18,"Virat"),
				new Boys(20,"Akash"),
				new Boys(9,"Haswin")
		};
		System.out.println("=============BEFORE SORTING============");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
//		for(int i=1;i<b.length;i++) {
//			b[i-1].compareTo(b[i]);
//		}
		Arrays.sort(b);
		System.out.println("=============AFTER SORTING============");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
//		int res=b[0].compareTo(b[1]);
//		System.out.println(res);
	}

}

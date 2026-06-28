package comparator;

import java.util.Arrays;

public class Driver_Cricket {
	public static void main(String[] args) {
		Cricket [] c= {
				new Cricket("RCB",1),
				new Cricket("CSK",8),
				new Cricket("MI",5),
				new Cricket("RR",4),
				new Cricket("DC",9),
				new Cricket("SRH",3),
				new Cricket("LSG",10),
				new Cricket("PBKS",2),
				new Cricket("KKR",6),
				new Cricket("GT",7)
		};
		
		System.out.println("====== BEFORE SORTING ======");
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		Arrays.sort(c,new SortByPosition());
		System.out.println("====== AFTER SORTING ======");
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}

}

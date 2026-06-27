package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filtering {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,29,98,2,9,7,6);
		List<Integer> l= new ArrayList<Integer>();
		System.out.println("Using for each loop :");
		for(int a:list) {
			if(a%2==0) {
				l.add(a);
			}
		}
		System.out.println(l);
		System.out.println();
		System.out.println("Using Stream filter");
		List<Integer> res= list.stream(). filter((i)->i%2==0)  .toList();
		//result		 //Source(input). Intermediate Actions .Terminate
		System.out.println(res);
		
		
		List<Integer> b=Arrays.asList(9,7,3,6,2,20);
		Stream<Integer> s=b.stream();
		
		System.out.println(s.toList());
	}
}

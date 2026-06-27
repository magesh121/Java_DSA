package stream;

import java.util.Arrays;
import java.util.List;

public class IntermediateActions {

	public static void main(String[] args) {
		
		List<String> slist=Arrays.asList("hi","and","Hello","world","welcome","to","java");
		slist.stream()  .filter((str)->str.length()>3) .forEach((a)->System.out.println(a));
	  //Source(Input)   .Intermediate Actions          .Termination
		System.out.println();
		System.out.println("===================================");

		List<Integer> ilist=Arrays.asList(10,29,20,89,9);
		ilist.stream()  .filter((a)->a%10==0).forEach((n)->System.out.print(n+" "));
		System.out.println();
		System.out.println("===================================");
		/*
		 * here the foreach is method and return type is void 
		 * for that foreach method
		 */
		List<Integer> alist=Arrays.asList(10,28,20,89,9);
		alist.stream().filter((a)->a%2==0).map((a)->a*2).forEach((a)->System.out.print(a+" "));
		
		/* 
		 * map method is used to transform the each element 
		 */
		System.out.println();
		System.out.println("=================================");
		List<Integer> dlist=Arrays.asList(20,10,20,89,9,9,30,13,9);
		dlist.stream().distinct().forEach((a)->System.out.print(a+" "));
		
		System.out.println();
		System.out.println("=================================");
		/* 
		 * distinct will remove duplicate elements 
		 */
		
		dlist.stream().sorted().forEach((a)->System.out.print(a+" "));
		
		System.out.println();
		System.out.println("=================================");
		/* 
		 * sorted will provide the elements in sorted order 
		 */
		dlist.stream().distinct().sorted().forEach((a)->System.out.print(a+" "));
		
		System.out.println();
		System.out.println("=================================");
		
	}
}

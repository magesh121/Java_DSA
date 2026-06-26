package builtIn_Functional_Interface;

import java.util.function.Predicate;

public class PredicateSample {
	
	public  void demo(Predicate<Integer >p) {
		boolean b=p.test(15);
		System.out.println(b);
	}

	public static void main(String[] args) {
		Predicate<Integer>p=(a)->a%2==0;
		System.out.println(p.test(10));
		
		Predicate<String> s=(str)->str.length()<10;
		System.out.println(s.test("hello world"));
		
		
		//
		PredicateSample b=new PredicateSample();
		b.demo((age)-> age<=18);
	}

}

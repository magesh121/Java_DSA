package builtIn_Functional_Interface;

import java.util.function.Function;

public class FunctionSample {

	public static void main(String[] args) {
		
		Function<String, Integer> fun=(a)->{
			System.out.println(a);
			return a.length();
		};
		
		int n=fun.apply("Magesh");
		System.out.println("length : "+n);
		
		Function<Integer ,Double> func=(a)->{
			System.out.println(a);
			return a+10.3;
		};
		double d=func.apply(1000);
		System.out.println(d);
		
		Function<Integer ,String> fun1=(a)->{
			System.out.println(a);
			return "Function";
		};
		
		String str=fun1.apply(10);
		System.out.println(str);
	}

}

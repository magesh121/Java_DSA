package builtIn_Functional_Interface;

import java.util.function.Supplier;

public class SupplierSample {

	public static void main(String[] args) {
		Supplier<Integer> s=()->20+20;
		System.out.println(s.get());
		
		Supplier<Double>a=()->{
			System.out.println("This is double");
			double d=239.89;
			return d;
		};
		System.out.println(a.get());
		Supplier<Boolean> b=()->{
			System.out.println("This is Boolean");
			int z=10,c=20;
			return z<c;
		};
		System.out.println(b.get());
	} 
}

package builtIn_Functional_Interface;

import java.util.function.Consumer;

public class ConsumerSample {
	public static void main(String[] args) {
		Consumer<Float> con=(f)->{
			System.out.println(f);
		};
		con.accept(102.40f);
		
		Consumer<String> c=(str)->{
			System.out.println(str);
			System.out.println(str.length());
		};
		c.accept("Magesh");
	}

}

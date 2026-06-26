package higherOrderFunction;

 interface HigherExample {

	void test(int a);
}

public class HigherClass {

	static void accept(int a,HigherExample h) {
		System.out.println("hello");
		h.test(a);
	}
	public static void main(String[] args) {
//		HigherExample h=(b)->{
//			System.out.println("value :"+b);
//		};
//		h.test(10);
		
		
		accept(2,(a)->{
			System.out.println("value : "+a);
		});
	}
}

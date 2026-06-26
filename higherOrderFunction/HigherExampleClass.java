package higherOrderFunction;


interface HigherInterface {

	void test(int a);
}


public class HigherExampleClass {
	
	static void exam(HigherInterface h) {
		h.test(10);
	}
	
	public static void main(String[] args) {
		exam((a)->{
			String name="Magesh";
			int marks=100;
			System.out.println("Student name is : "+name);
			System.out.println("Scored marks : "+marks);
			System.out.println("Value of a is :"+a);
		});
	}
}

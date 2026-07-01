package exception;

public class ExceptionPropagation {
	
	public static void method1() {
		System.out.println("m1st");
		System.out.println(10/0);
		System.out.println("m1end");
	}
	public static void method2() {
		System.out.println("m2st");
		try {
			method1();
		}
		catch (Exception e) {
			System.out.println(e);
		}
			
		System.out.println("m2end");

	}

	public static void main(String[] args) {
		System.out.println("Main Start");
		method2();
		System.out.println("Main End");
	}

}

package exception;


public class Throws {

	private static void method1() throws ClassNotFoundException{
		System.out.println("m1st");
		Class.forName("");
		System.out.println("m1end");
	}
	private static void method2() throws ClassNotFoundException,ArithmeticException,NullPointerException{
		System.out.println("m2st");
		method1();
		System.out.println("m2end");
	}
	public static void main(String[] args) {
		System.out.println("main start");
		try {
			method2();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} 
		System.out.println("Main End");
	}
}

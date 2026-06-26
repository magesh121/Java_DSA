package functional_Interface;

public class NonStaticMethodReference {

	int add(int a,int c) {
		System.out.println("Add Method");
		return a+c;
	}
	public static void main(String[] args) {
		MethodReferenceForNonStatic r= new NonStaticMethodReference()::add;
		System.out.println(r.add(22, 39));
	}
}

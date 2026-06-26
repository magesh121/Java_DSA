package functional_Interface;

public class MultipleStmtsDriver {

	public static void main(String[] args) {
		MultipleStmts m=(a,b)->a+b;
		System.out.println(m.test(10, 39));
	}
}

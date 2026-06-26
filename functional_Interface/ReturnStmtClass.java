package functional_Interface;

public class ReturnStmtClass {

	public static void main(String[] args) {
		ReturnStmt r= (int a)-> a;/*IMPLICIT RETURN 
		(COMPILER WILL ADD THE RETURN STATEMENT*/
		System.out.println(r.test(89));
		
		ReturnStmt b=(c)->{
			System.out.println("Hello world  !");
			return c;
		};
		System.out.println(b.test(90));
	}
}

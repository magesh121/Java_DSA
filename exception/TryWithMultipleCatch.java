package exception;

public class TryWithMultipleCatch {
	public static void main(String[] args) throws ArithmeticException {
		try {
			int a=10/0;
			System.out.println(a);
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("v2ku poda");
		}
		
	}

}

package exception;


public class Final {
	public static void main(String[] args) {
		try {
			Object o=new Object();
			Final fb=(Final) o;
			System.out.println("try block");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch (NullPointerException e) {
			 System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally");
		}
	}

}

package exception;

public class CheckedException {

	public static void main(String[] args) {
		try{
			Class.forName(null);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.err.println("magesh");
	}
}

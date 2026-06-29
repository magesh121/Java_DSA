package recursion;

public class PrintNumberInReverse {

	public static void main(String[] args) {
		int a = 10;
		print(a);
	}

	private static void print(int a) {
		if (a == 0) {
			System.out.print(0);
			return;
		}
		System.out.print( a-- +  " ");
		print(a);
	}
}

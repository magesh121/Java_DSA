package recursion;

public class Factorial {
	public static void main(String[] args) {
		int a=fact(0);
		System.out.println(a);
	}

	private static int fact(int i) {
		if(i==0) {
			return 1;
		}
		return i*fact(i-1);
	}

}

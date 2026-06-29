package recursion;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = fibo(10);
		System.out.println(a);
	}

	private static int fibo(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}
}

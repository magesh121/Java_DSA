package recursion;

public class SumOfNumbers {

	public static void main(String[] args) {
		int a=10;
		int res=sum(a);
		System.out.println(res);
		
	}

	private static int sum(int a) {
		if(a==0) {
			return 0;
		}
		return a+sum(a-1);
	}
}

package functional_Interface;

public class LambdaExpressionClass {
	public static void main(String[] args) {
		LambdaExpression l=(
				/*parameters if the abstract contains method*/
				a,b,c)->{
				/*Implementation part of the abstract method*/
					int sum=a+b+c;
				System.out.println("SUM : "+sum);
				};
		l.test(10,20,30);
	}

}

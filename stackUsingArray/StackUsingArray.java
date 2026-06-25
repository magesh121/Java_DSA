package stackUsingArray;

public class StackUsingArray {
	
	public static void main(String[] args) {
		ArrayForStack a= new ArrayForStack();
		a.push(10);
		a.push(20);
		a.push(30);
		a.push(100);
		a.push(200);
		a.push(300);
		a.pop();
		a.pop();
		a.display();
	}

}

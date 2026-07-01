package exception;

public class ExceptionClass {
	public static void main(String[] args) {
		System.out.println("start");
//		Thread.sleep(5000);
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				System.out.println(e);
			}
			System.out.println(i);
		}
		System.out.println("end");
	}

}

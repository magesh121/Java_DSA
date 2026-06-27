package thread;

public class MyThread3 extends Thread{

	@Override
	public void run() {
		for (int i=0;i<=100;i++) {
			System.out.println("My thread 3 : "+i);
		}
	}
}

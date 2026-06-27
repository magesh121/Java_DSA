package thread;

public class ThreadDriver {

	public static void main(String[] args) throws InterruptedException {
		MyThread1 m1= new MyThread1();
		m1.start();
		m1.join();
		// Thread m1 will completely execute ,using join method
		MyThread2 m2= new MyThread2();
		// Thread m2 and m3 will simultaneously execute by mixed versions
		m2.start();
		MyThread3 m3= new MyThread3();
		m3.start();
	}
}

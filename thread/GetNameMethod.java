package thread;

public class GetNameMethod extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()); //Main Thread
		
		GetNameMethod g= new GetNameMethod(); // Thread-0
		g.start();
		
		GetNameMethod gn= new GetNameMethod(); // Thread-1
		gn.start();
	}
}

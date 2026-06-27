package thread;

public class IsAliveMethod extends Thread{

	@Override
	public void run() {
		System.out.println("Running...");
		System.out.println(Thread.currentThread().isAlive());
	}
	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().isAlive());
		
		IsAliveMethod a= new IsAliveMethod();
		a.start();
		a.join();
		System.out.println(a.isAlive());
//		System.out.println(a.getState());
		
	}
}

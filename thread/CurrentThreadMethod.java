package thread;


public class CurrentThreadMethod extends Thread{
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread());
	}
	
	public static void main(String[] args) {
		Thread t= new Thread();
		System.out.println(t.currentThread());
		
		System.out.println("===================");
		
		
		
		CurrentThreadMethod curr= new CurrentThreadMethod();
		curr.start();
		System.out.println("===================");
//		curr.start();
		
		
		
		System.out.println("===================");
		CurrentThreadMethod curr1= new CurrentThreadMethod();
		curr1.start();
		System.out.println("===================");
		
	}

}

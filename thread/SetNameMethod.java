package thread;

public class SetNameMethod extends Thread{
	
	
	@Override
	public void run() {
		System.out.println("run method");
		System.out.println(Thread.currentThread().getName());
	}
	
	
	public static void main(String[] args) {
		
		Thread.currentThread().setName("magesh");
		System.out.println(Thread.currentThread().getName());
		
		SetNameMethod s=new SetNameMethod();
		s.setName("haswin");
		s.start();
	}
}

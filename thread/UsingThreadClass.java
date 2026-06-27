package thread;


//  Step 1: Extends Thread Class
public class UsingThreadClass extends Thread{

//  Step 2: Override run method
	@Override
	public void run() {
		System.out.println("Thread running...");
	}
	public static void main(String[] args) {
//  Step 3: Create Object for the class
		UsingThreadClass t =new UsingThreadClass();
//  Step 4: using objectReference call the start method
		t.start();
	}
}

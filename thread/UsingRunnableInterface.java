package thread;

// Step 1: Implements Runnable Interface
public class UsingRunnableInterface implements Runnable {

// Step 2: Override run() Method 
	@Override
	public void run() {
		System.out.println("Runnable Thread Running...");
	}
	
	public static void main(String[] args) {
		
// Step 3: Create an object of the class
		UsingRunnableInterface i =new UsingRunnableInterface();
// Step 4: Create an object for the thread method to access 
//		   start method and also pass the object reference of the 
//		   object reference
		Thread t=new Thread(i);
// Step 5: start() method 
		t.start();
		
	}

}

package functional_Interface;

public class SampleDriver  implements Sample{
	/* 
	 * 
	 * HERE TOSTRING METHOD IS NOT OVERRIDDEN BECAUSE THE 
	 * PARENT OF THE SAMPLEDRIVER CLASS IS A CHILD CLASS OF
	 * OBJECT CLASS SO THE TOSTRING METHOD IS OVERRIDEN BY DEFAULT
	 * SO DONT NEED TO OVERRIDE , IF YOU WANT TO CHANGE 
	 * THE IMPLEMENTATION WE CAN OVERRIDE .
	 * 
	 * */
	
	
	//Overriding the Abstract method
	@Override
	public void test() {
		System.out.println("Test Method");
	}
	
	
	public static void main(String[] args) {
		//object creation
		Sample s=new SampleDriver();//UPCASTING 
		//method calling
		s.test();
	}

}

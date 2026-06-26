package higherOrderFunction;

interface higher {

	higher a();
}


public class higher_Class {

	public static higher test() {
		return ()->{
			System.out.println("hello");
			return null;
			};
		
	}
	public static void main(String[] args) {
		higher h=test();
		h.a();
	}
}

package circularArray;

public class CircularArrayDriver {

	public static void main(String[] args) {
		CircularArray c= new CircularArray();
		c.insert(20);
		c.insert(30);
		c.insert(40);
		c.insert(50);
		c.insert(60);
		c.display();
		System.out.println(c.delete());
		System.out.println(c.delete());
		c.display();
	}
	
}

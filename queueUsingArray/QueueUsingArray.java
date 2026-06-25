package queueUsingArray;

public class QueueUsingArray {

	public static void main(String[] args) {
		ArrayForQueue q= new ArrayForQueue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.display();
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.display();
	}
}

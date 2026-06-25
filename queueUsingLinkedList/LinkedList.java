package queueUsingLinkedList;


public class LinkedList {
	
	Node front;
	Node rear;
	int size;
	
	//ENQUEUE 
	
	public void enqueue(int data) {
		Node newNode =new Node(data);
		if(isEmpty()) {
			front=rear=newNode;
			size++;
			return;
		}
		rear.next=newNode;
		rear=newNode;
		size++;
	}
	
	//DEQUEUE
	
	public int dequeue() {
		if(size==0) {
			throw new RuntimeException("Bruh Queue is already Empty :) ");
		}
		if(size==1) {
			front=rear=null;
			size=0;
			return front.data;
		}
		
		int val=front.data;
		front=front.next;
		return val;
	}
	
	
	//ISEMPTY
	public boolean isEmpty() {
		return front==null;
	}
	
	//PEEK
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("Bruh Queue is Empty :) ");
		}
		return front.data;
	}
	
	//DISPLAY
	
	public void display() {
		Node temp = front;
		if (front == null) {
			System.out.println("Queue is Empty.");
			return;
		}
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next; 
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		LinkedList q=new LinkedList();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.display();
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.display();
		System.out.println(q.peek());
		
	}

}

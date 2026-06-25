package queueUsingArray;

public class ArrayForQueue {
	int[] queue;
	int capacity = 10;
	int rear;
	int front;

	public ArrayForQueue() {
		rear = -1;
		queue = new int[capacity];
	}

	// ISEMPTY METHOD

	public boolean isEmpty() {

		return rear == -1;

	}

	// ISFULL METHOD
	public boolean isFull() {
		return capacity == rear + 1; // here +1 because the default is -1;
	}

	// ENQUEUE
	public void enqueue(int data) {
		if (isFull()) {
			resize();
		}
		queue[++rear] = data;
	}

	// DEQUEUE
	public int dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("Bruh Queue is Empty . you can't pop   :) ");
		}
		int val = queue[front];
		for (int i = front; i < rear; i++) {
			queue[i] = queue[i + 1];
		}
		rear--;
		return val;
	}

	// PEEK

	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("Bruh Queue is Empty .There is no Peek   :) ");
		}
		return queue[front];
	}

	// RESIZE METHOD WITH GROWTH FACTOR OF (*2)

	public void resize() {
		capacity = capacity * 2;
		int newArr[] = new int[capacity];

		for (int i = front; i <= rear; i++) {
			newArr[i] = queue[i];
		}
		queue = newArr;
	}

	// PRINTING ELEMENTS IN THE QUEUE

	public void display() {
		for (int i = front; i <= rear; i++) {
			System.out.print(queue[i] + " -> ");
		}
		System.out.println("null");
	}
}

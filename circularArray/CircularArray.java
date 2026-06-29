package circularArray;

public class CircularArray {

	int[] arr;
	int size = 10;
	int rear = -1;
	int front = -1;

	// FORMULA (FRONT=(FRONT+1)%SIZE) for deletion
	// FORMULA (REAR=(REAR+1)%SIZE) for insertion
	public CircularArray() {
		arr = new int[size];
	}

	// ISEMPTY METHOD
	public boolean isEmpty() {
		return front == -1 && rear == -1;
	}

	// ISFULL METHOD
	public boolean isFull() {
		return ((rear + 1) % size) == front;
	}

	// INSERT METHOD
	public void insert(int data) {

		if (isFull()) {
			resize();
		}
		if (isEmpty()) {
			front = 0;

			/*
			 * here we can use the above the statement or the below three statements
			 */

//			front = rear = 0;
//			arr[rear] = data;
//			return;
		}
		rear = ((rear + 1) % size);
		arr[rear] = data;
	}

	// DELETE METHOD

	public int delete() {
		if (isEmpty()) {
			throw new RuntimeException("Bruhh it is Already Empty :) ");
		}
		int val = arr[front];
		if (front == rear) {
			front = rear = -1;
		} else {
			front = ((front + 1) % size);
		}
		return val;
	}

	// PEEK METHOD

	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("Array is Empty ");
		}
		return arr[front];
	}

	// RESIZE METHOD

	public void resize() {
		size = size * 2;
		int newArr[] = new int[size];

		for (int i = front; i <= rear; i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;
	}

	// PRINTING ELEMENTS IN THE ARRAY

	public void display() {
		if (isEmpty()) {
			throw new RuntimeException("Array is Empty :) ");
		}
		int temp = front;
		while (true) {
			System.out.print(arr[temp] + " -> ");
			if (temp == rear) {
				break;
			}
			// UPDATION PURPOSE ALSO WE USE THE SAME FORMULA
			temp = (temp + 1) % size;
		}
		System.out.println("null");

	}
}

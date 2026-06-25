package stackUsingArray;

public class ArrayForStack {

	int[] stack;
	int capacity = 10;
	int top;

	
	//CONSTRUCTOR FOR INITIALIZATION OF TOP AND STACK CAPACITY
	public ArrayForStack() {
		top = -1;
		stack = new int[capacity];
	}

	// ISEMPTY METHOD

	public boolean isEmpty() {
		return top == -1;
	}

	// ISFULL METHOD
	public boolean isFull() {
		return capacity == top + 1; // here +1 because the default is -1;
	}

	// PUSH METHOD

	public void push(int data) {

		if (isFull()) {
			resize();
		}

		stack[++top] = data; // here ++top FOR PreIncrement (default top is -1)

	}

	// POP METHOD

	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Bruh Stack is Empty . you can't pop   :) ");
		}

		int val = stack[top];
		top--;
		return val;
	}

	// PEEK METHOD

	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("Bruh Stack is Empty .There is no Peek   :) ");
		}
		return stack[top];
	}

	// RESIZE METHOD WITH GROWTH FACTOR OF (*2)

	public void resize() {
		capacity = capacity * 2;
		int newArr[] = new int[capacity];

		for (int i = 0; i <= top; i++) {
			newArr[i] = stack[i];
		}
		stack = newArr;
	}

	// PRINTING THE ELEMENTS

	public void display() {
		int temp = top;
		for (int i = temp; i >= 0; i--) {
			System.out.print(stack[i] + " -> ");
		}
		System.out.println("null");
	}

}

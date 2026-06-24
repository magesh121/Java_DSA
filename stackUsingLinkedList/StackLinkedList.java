package stackUsingLinkedList;



public class StackLinkedList {

	Node top;
	int size;
	
	
	//PUSH 
	
	
	public void push(int data) {
		Node newNode = new Node(data);
		if(top==null) {
			top=newNode;
			size++;
			return;
		}
		newNode.next=top;
		top=newNode;
		size++;
	}
	
	
	// POP
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Bruh Stack is Empty :) ");
		}
		int val=top.data;
		top=top.next;
		size--;
		return val;
	}
	
	
	//PEEK
	
	public int peek() {
		if(top==null) {
			throw new RuntimeException("Bruh Stack is Empty :) ");
		}
		return top.data;
	}
	
	
	//IS EMPTY
	
	public boolean isEmpty() {
		return top==null;
	}
	
	
	
	// PRINTING THE ELEMENTS

		public void display() {
			Node temp = top;
			if (top == null) {
				System.out.println("Bruh Stack is Empty :) ");
				return;
			}
			while (temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println("null");
		}
		
		public static void main(String[] args) {
			StackLinkedList sl=new StackLinkedList();
			sl.push(10);
			sl.push(20);
			sl.push(30);
			sl.display();
			sl.pop();
			sl.display();
			System.out.println(sl.peek());
		}
}

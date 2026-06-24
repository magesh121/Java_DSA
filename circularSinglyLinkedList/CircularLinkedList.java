package circularSinglyLinkedList;

import java.util.NoSuchElementException;


public class CircularLinkedList {

	Node head; 
	Node tail;
	int size;
	
	
	// ADD FIRST METHOD

		public void addFirst(int data) {
			Node newNode = new Node(data);
			if (head == null) {
				head = tail = newNode;
				tail.next = head;
				size++;
				return;
			}
			newNode.next = head;
			head = newNode;
			tail.next=head;
			size++;
		}
		
		
		
		// ADD LAST METHOD

		public void addLast(int data) {
			Node newNode = new Node(data);
			if (head == null) {
				head = tail = newNode;
				tail.next = head;
				size++;
				return;
			}
			tail.next = newNode;
			tail = newNode;
			tail.next=head;
			size++;
		}
		
		
		// REMOVE FIRST

		public void removeFirst() {
			if (size == 0) {
				throw new NoSuchElementException("Bruh Your linked List is empty :) ");
			}
			if (size == 1) {
				head = tail = null;
				size = 0;
				return;
			}
			head = head.next;
			tail.next=head;
			size--;
		}
		
		
		
		// REMOVE ELEMENT AT LAST
		public void removeLast() {
			if (size == 0) {
				throw new NoSuchElementException("Bruh Your linked List is empty :) ");
			}
			if (size == 1) {
				head = tail = null;
				size = 0;
				return;
			}
			Node temp = head;
			while (temp.next.next != head) {
				temp = temp.next;
			}
			temp.next = head;
			tail = temp;
			size--;
		}
		
		
		
		// INSERT AT INDEX
		
		public void insert(int index,int data) {
			if (index < 0 || index > size) {
				throw new IndexOutOfBoundsException("Bruh " + index + " Index is Invalid ");
			}
			if(index==0) {
				addFirst(data);
				return;
			}
			if (index == size) {
				addLast(data);
				return;
			}
			Node newNode=new Node(data);
			Node temp=head;
			for(int i=0;i<index-1;i++) {
				temp=temp.next;
			}
			newNode.next=temp.next;
			temp.next=newNode;
			size++;
		}
		
		
		
		
		//REMOVE BY INDEX
		
		public void remove(int index) {
			if (index < 0 || index >= size) {
				throw new IndexOutOfBoundsException("Bruh " + index + " Index is Invalid ");
			}

			Node temp = head;

			if (index == 0) {
				removeFirst();
				return;
			}
			if(index==size-1) {
				removeLast();
				return;
			}
			for(int i=0;i<index-1;i++) {
				temp=temp.next;
			}
			
			temp.next=temp.next.next;
			size--;
		}
		
		
		//ISEMPTY METHOD
		public boolean isEmpty() {
			return size==0;
		}
		
		
		
		//GET FISRT  METHOD
		
		public int getFirst() {
			if (head == null) {
				throw new NoSuchElementException("Bruh the Linked List is Empty , So you cant retrive the first element");
			}
			return head.data;
		}
		
		
		
		
		//GET LAST METHOD
		
		public int getLast() {
			if (head == null) {
				throw new NoSuchElementException("Bruh the Linked List is Empty , So you cant retrive the first element");
			}
			return tail.data;
		}
		
		
		//GET ELEMENT AT INDEX
		
		public int get(int index) {
			
			if (index < 0 || index >= size) {
				throw new IndexOutOfBoundsException("Bruh " + index + " Index is Invalid ");
			}
			Node temp=head;
			for(int i=0;i<index;i++) {
				temp=temp.next;
			}
			return temp.data;
		}
		
		
		
		
		// PRINTING THE ELEMENTS

		public void display() {
			Node temp = head;
			if (head == null) {
				System.out.println("Linked List is Empty.");
				return;
			}
			
			do {
				System.out.print(temp.data + " -> ");
				temp = temp.next; // it will iterate the current reference .
			}
			while (temp != head) ;
				
			
			System.out.println(head.data+"(head)");
		}
		
		
	public static void main(String[] args) {
		CircularLinkedList c= new CircularLinkedList();
		c.addFirst(30);
		c.addFirst(20);
		c.addFirst(10);
		c.insert(3, 40);
		c.addLast(50);
		c.addFirst(60);
		c.display();
		System.out.println(c.get(4));
		System.out.println(c.getFirst());
		System.out.println(c.getLast());
	}

}

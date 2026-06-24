package circularDoublyLinkedList;

import java.util.NoSuchElementException;

public class CircularDoublyLinkedList {

	Node head;
	Node tail;
	int size;
	
	//ADD FIRST METHOD
	
	public void addFirst(int data) {
		Node newNode=new Node(data);
		if (head == null) {
			head = tail = newNode;
			head.next = head;
			head.prev=head;
			size++;
			return;
		}
		
		
		newNode.next=head;
		newNode.prev=tail;
		
		
		head.prev=newNode;
		tail.next=newNode;
		
		
		head=newNode;
		size++;
	}
	
	//ADD LAST
	
	public void addLast(int data) {
		Node newNode=new Node(data);
		if (head == null) {
			head = tail = newNode;
			head.next = head;
			head.prev=head;
			size++;
			return;
		}
		
		
		newNode.next=head;
		newNode.prev=tail;
		
		
		tail.next=newNode;
		head.prev=newNode;
		
		tail=newNode;
		size++;
		
	}
	
	
	
	//REMOVE FIRST
	
	public void removeFirst() {
		
		if (size == 0) {
			throw new NoSuchElementException("Bruh Your linked List is empty :) ");
		}
		if (size == 1) {
			head = tail = null;
			size = 0;
			return;
		}
		
		
		head=head.next;
		head.prev=tail;
		
		
		tail.next=head;
		
		size--;
	}
	
	
	//REMOVE LAST
	
	public void removeLast() {
		
		if (size == 0) {
			throw new NoSuchElementException("Bruh Your linked List is empty :) ");
		}
		if (size == 1) {
			head = tail = null;
			size = 0;
			return;
		}
		
		
		tail=tail.prev;
		
		
		tail.next=head;
		head.prev=tail;
		
		size--;
	}
	
	
	//INSERT AT INDEX
	
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
		
		
		newNode.prev=temp;
		newNode.next=temp.next;
		temp.next.prev=newNode;
		temp.next=newNode;
		size++;
	}
	
	// PRINTING THE ELEMENTS

			public void display() {
				Node temp = head;
				if (head == null) {
					System.out.println("Linked List is Empty.");
					return;
				}
				
				do {
					System.out.print(temp.data + " <-> ");
					temp = temp.next; // it will iterate the current reference .
				}
				while (temp != head) ;
					
				
				System.out.println(head.data+"(head)");
			}
	
	
	
	public static void main(String[] args) {
		CircularDoublyLinkedList c=new CircularDoublyLinkedList();
		c.addFirst(10);
		c.addFirst(20);
		c.addFirst(30);
		c.display();
	}
}

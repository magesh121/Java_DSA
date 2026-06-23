package doublyLinkedList;

import java.util.NoSuchElementException;


public class LinkedList {
	
	Node head;
	Node tail;
	int size;
	
	
	
	
	
	// ADD FIRST
	
	public void addFirst(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
			size++;
			return;
		}
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
		size++;
	}
	
	
	
	
	
	// REMOVE FIRST
	
	public void removeFirst() {
		if(size==0) {
			throw new NoSuchElementException("Bruh Your linked List is empty :) ");
		}
		if(size==1) {
			head=tail=null;
			size=0;
			return;
		}
		head=head.next;
		head.prev=null;
		size--;
	}
	
	
	//ADD LAST
	public void addLast(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
			size++;
			return;
		}
		newNode.prev=tail;
		tail.next=newNode;
		tail=newNode;
		size++;
	}


	//REMOVE LAST
	
	public void removeLast() {
				
		if(size==0) {
			throw new NoSuchElementException("Bruh Your linked List is empty :) ");
		}
		if(size==1) {
			head=tail=null;
			size=0;
			return;
		}
		
		tail=tail.prev;
		tail.next=null;
		size--;
	}
	
	
	//INSERT AT INDEX
	
	public void insert(int data,int index) {
		if(index<0 || index>size) {
			throw new IndexOutOfBoundsException("Bruh "+index+" Index is Invalid ");
		}
		if(index==0) {
			addFirst(data);
			return;
		}
		if(index==size) {
			addLast(data);
			return;
		}
		
		Node newNode=new Node(data);
		Node temp=head;
		for(int i=0;i<index-1 && temp!=null;i++) {
			temp=temp.next;
		}
		newNode.next=temp.next;
		newNode.prev=temp;
		temp.next.prev=newNode;
		temp.next=newNode;
		size++;
	}
	
	
	
	//REMOVE AT INDEX
	public void remove(int index) {
		
		if(index<0 || index>size) {
			throw new IndexOutOfBoundsException("Bruh "+index+" Index is Invalid ");
		}
		
		
		
		
		if(size==0) {
			head=tail=null;
			size=0;
			return;
		}
		if(index==0) {
			head=head.next;
			head.prev=null;
			size--;
			return;
		}
		
		Node temp=head;
		
		for(int i=0;i<index-1;i++) {
			temp=temp.next;
		}
		
		
		Node delNode=temp.next;
		temp.next=delNode.next;
		
		
		if(delNode.next!=null) {
			delNode.next.prev=temp;
		}
		else {
			tail=temp;
		}
		
		
		size--;
	}
	
	
	
	//IS EMPTY METHOD
	
	public boolean isEmpty() {
		return head==null;
	}
	
	
	
	//GET FIRST ELEMENT
	
	
	
		public int getFirst() {
			if(head==null) {
				throw new NullPointerException("Bruh the Linked List is Empty , So you cant retrive the first element");
			}
			return head.data;
		}
		
		
		
		//GET LAST ELEMENT
		
		public int getLast() {
			if(tail==null) {
				throw new NullPointerException("Bruh the Linked List is Empty , So you cant retrive the last element");
			}
			return tail.data;
		}
	
	
		
	// GET ELEMENT BY INDEX

	public int getElement(int index) {
		Node temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		return temp.data;
	}
	
	//PRINTING THE ELEMENTS IN THE DOUBLY LINKED LIST
	
	public void display() {
		Node temp=head;
		if(head==null) {
			System.out.println("Linked List is Empty.");
			return ;
		}
		System.out.print("null <-> ");
		while(temp!=null) {
			System.out.print(temp.data+" <-> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.addFirst(40);
		l.addFirst(30);
		l.addFirst(20);
		l.addFirst(10);
		l.display();
//		l.removeFirst();
//		l.removeLast();
//		l.display();
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.getElement(2));
	}

}

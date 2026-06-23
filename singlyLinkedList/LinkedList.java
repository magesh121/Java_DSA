package singlyLinkedList;

import java.util.NoSuchElementException;



public class LinkedList {

	Node head;
	Node tail;
	int size;
	
	
	
	
	// ADD FIRST METHOD
	
	
	
	public void addFirst(int data) {
		Node newNode= new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			size++;
			return ;    
			/*
			 * here we are specifying the return because not to execute the remaining
			 * Statements
			 * 
			 * 
			 * we can also use else statement for the below 2 lines
			 */
		}
		newNode.next=head;
		head=newNode;
		size++;
	}
	
	
	
	// ADD LAST METHOD 
	
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			size++;
			return ;
			/*
			 * here we are specifying the return because not to execute the remaining
			 * Statements
			 * 
			 * 
			 * we can also use else statement for the below 2 lines
			 */
		}
		tail.next=newNode;  
		tail=newNode;
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
		size--;
	}
	
	
	
	
	
	// REMOVE ELEMENT AT LAST 
	public void removeLast() {
		if(size==0) {
			throw new NoSuchElementException("Bruh Your linked List is empty :) ");
		}
		if(size==1) {
			head=tail=null;
			size=0;
			return;
		}
		Node temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
		tail=temp;
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
		
		for(int i=0;i<index-1 && temp!=null ;i++) {
			temp=temp.next;
		}
		
		newNode.next=temp.next;
		temp.next=newNode;
		size++;
	}
	
	
	
	
	//REMOVE BY INDEX
	
	
		public void removeIndex(int index) {
			
			if(index<0 || index>size) {
				throw new IndexOutOfBoundsException("Bruh "+index+" Index is Invalid ");
			}
			
			
			Node temp=head;
			
			
			if(head==null) {
				return;
			}
			
			
			if (index == 0) {
		        head = head.next;
		        return;
		    }
			
			
			for(int i=0;i<index-1;i++) {				
				temp=temp.next;
			}
			temp.next=temp.next.next;
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
	
	
	
	
	
	//GET ELEMENT AT INDEX
	
	public int getElement(int index) {
		Node temp=head;
		for(int i=0;i<index;i++) {
			temp=temp.next;
		}
		return temp.data;
	}
	
	
	
	
	
	
	// PRINTING THE ELEMENTS
	
	
	
		public void display() {
			Node temp=head;
			if(head==null) {
				System.out.println("Linked List is Empty.");
				return ;
			}
			while( temp!=null) {
				System.out.print(temp.data+" -> ");
				temp=temp.next;  // it will iterate the current reference .
			}
			System.out.println("null");
		}
		
	
	
	
	
	
	
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.addFirst(10);
		l.addFirst(20);
		l.addFirst(30);
		l.addFirst(40);
		l.addFirst(50);
		l.addLast(100);
		l.addLast(200);
		l.addLast(300);
		l.display();
		l.removeFirst();
		l.display();
		l.removeLast();
		l.display();
//		System.out.println(l.size);
		l.insert(19, 3);
		l.display();
		System.out.println(l.isEmpty());
		System.out.println(l.size);
		System.out.println(l.getElement(6));
		
	}
}

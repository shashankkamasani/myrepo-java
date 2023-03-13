package shash;

import java.util.StringTokenizer;

import utils.ExcelUtils;

public class DoublyLinkedL {
private Link head;
private Link tail;
private int size;


public DoublyLinkedL() {
	head = null;
	tail = null;
	setSize(0);
}

public Boolean isEmpty() {
	return head == null;
}

public void insert(Student student) {
	Link node = new Link(student);
	if(isEmpty()) {
		head = node;
	} else {
		tail.next = node;
		
		}
  node.previous = tail;
  tail = node;
  setSize(getSize() + 1);
	}
	
public void delete (int id) {
	if(head == null) {
		return;
	}
	Link node = head;
	
	while(node.getData().getIdNum() != id) {
		node = node.next;
	}
	
	if(node.next == null) {
		node.previous.next = null;
	} else if(node.previous == null) {
		node = node.next;
		node.previous = null;
		head = node;
	} else {
	    node.previous.next = node.next;
	    node.next.previous = node.previous;
	}
    size--;
}

public void print() {
	
	if(head== null ) {
		return;
	}
	
	
	Link current = head;
	while(current != null) {
		System.out.print(current.getData().getName());
		System.out.print(" ");
		System.out.print( current.getData().getAge());
		System.out.print(" ");
		System.out.print(current.getData().getWeight());
		System.out.println(" ");
		current = current.next;
	}
}

 public static void main(String[] args) {
	DoublyLinkedL list = new DoublyLinkedL();
	list.insert(new Student("shashank", 15, 110));
	list.insert(new Student("Aditya", 19, 220));
	list.print();
	list.delete(1);
	list.print();
}

public int getSize() {
	return size;
}

public void setSize(int size) {
	this.size = size;
}


}




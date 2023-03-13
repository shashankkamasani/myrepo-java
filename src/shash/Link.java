package shash;



public class Link {

private Student data;
public Link previous;
public Link next;





public Link(Student d) {
	previous = null;
	data = d;
	next = null;
}

public Link(Link p, Student d, Link n) {
	previous = p;
	data = d;
	next = n;
}

public Student getData() {
	return data;
}

public Link getPrevious() {
	return previous;
}

public void setPrevious(Link previous) {
	this.previous = previous;
}

public Link getNext() {
	return next;
}

public void setNext(Link next) {
	this.next = next;
}

public void setData(Student data) {
	this.data = data;
}

}
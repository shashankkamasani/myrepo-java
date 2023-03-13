package dataStructures;

public class Stack {
 private int stack [];
 private int top;
 
 public Stack(int size) {
	 stack = new int [size];
	 top = 0;
 }
 
 public void push(int data) {
	 stack[top] = data;
	 top++;
 }
 
 public int pop() {
	 int data;
	 data = stack[top];
	 stack[top] = 0;
	 top--;
	 return data;
 }
 
 public int peak () {
	 int data;
	 data = stack[top];
	 return data;
 }
 
 public int getSize() {
	 return top;
 }
		
 public void show() {
	 for(int i : stack) {
		 System.out.println(stack[i]);
	 }
   }
 public static void main(String[] args) {
	
	 Stack stack = new Stack(7);
	 stack.push(0);
	 stack.push(1);
	 stack.push(2);
	 stack.push(3);
	 stack.push(4);
	 stack.push(5);
	 stack.push(6);


	 stack.show();
	 
	 System.out.println("------------------");
	 
	 stack.pop();
	 

	 stack.show();
	 
	 
	
}
}

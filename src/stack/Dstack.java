package stack;

public class Dstack {
	int capacity=2;
	int stack[]= new int[capacity];
	int top = 0;
	public void push(int i) {
	
		if(top == capacity) 
			expand();
		
		stack[top] = i;
		top++;
		
	}
	private void expand() {
		int Dstack[]=new int[capacity*2];
	System.arraycopy(stack, 0, Dstack, 0, top);
		stack=Dstack;
		capacity*=2;
	}
	
	public void display() {
		for(int i : stack) {
			System.out.print(i+" ");
		} 
		
	}
	public void pop() {
		if(top==0) {
			System.out.println("stack is empty");
		}else {
		top--;
		System.out.println("deleted value "+stack[top]);
		stack[top] = 0;
		 if(top < capacity/2) {
		
					int Dstack[]=new int[capacity/2];
				System.arraycopy(stack, 0, Dstack, 0, top);
					stack=Dstack;
					capacity/=2;
				
		 }
			}
			
					}
	
	public void size() {
		System.out.println(top);
		
		
	}
	public boolean empty() {
		return top<=0;
		
	}
	public int peek() {
		if(top==0) {
			return 0;
		}else
		return stack[top-1];
	}
	
	
	
}

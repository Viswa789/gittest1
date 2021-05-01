package stack;

public class stack {
	
	int stack[]= new int[5];
	int top = 0;
	public void push(int i) {
		stack[top] = i;
		top++;
		
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

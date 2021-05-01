package stack;

public class checkmain {

	public static void main(String[] args) {
	  stack s = new stack();
	  s.push(25);
	  s.push(35);
	  s.push(45);
	  s.push(55);
	  s.push(65);
	  s.display();
	  
	  s.pop();
	  s.size();
	  System.out.println("is stack empty--"+s.empty());
	  
	 System.out.println(s.peek());
	  

	}

}

package linkedlistt;

public class linklist {
	Node head;
	
	public void inst(int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head == null) {
			head=node;
		}else {
				Node n=head;
				while(n.next !=null) {
					n=n.next;
				}
				n.next = node;
		}
	}
	public void display() {
		Node n = head;
		while(n.next != null) {
		System.out.println(n.data);
		 n = n.next;
		}
		System.out.println(n.data);
	}
	
	public void addatfirst(int data) {
		Node node=new Node();
		node.data=data;
		node.next=head;
		head=node;
	}
	
	public void addatmiddle(int index, int data) {
		Node node=new Node();
		node.data=data;
		node.next=null;
		Node n=head;
		for(int i=0;i<index-1;i++) {
				n = n.next;
		}
		node.next=n.next;
		n.next = node;
		
		
	}
	
	public void delete(int index) {
		System.out.println("\n\n");
		Node n=head;
		if(index==0) {
			head=n.next;
		}else {
		
		
		for(int i=0;i<index;i++) {
			
			n=n.next;
		}
		
		Node m=head;
		for(int i=0;i<index-1;i++) {
			
			m=m.next;
		}
		m.next = n.next;
		n.next=null;
		}
		
		
	}
				//OR
	
	public void delete1(int index) {
		Node n=head;
		
		if(index==0) {
			head = n.next;
		}else {
		
		for(int i=0;i<index-1;i++) {
			n=n.next;
		}
		Node n1;
		n1=n.next;
		n.next = n1.next;
		
	}	}

	

}

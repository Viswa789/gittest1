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
	
	

}

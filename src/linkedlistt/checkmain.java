package linkedlistt;

public class checkmain {

	public static void main(String[] args) {
	linklist k = new linklist();
	
		k.inst(0000000000000000000000000000000000000000);
		k.inst(12);
		k.inst(43);
		k.inst(432);
		k.inst(23);
		k.inst(432);
		k.inst(456);
		k.inst(478);
		k.display();
		
		//k.addatfirst(0);
		//k.display();
		
		//k.addatmiddle(0, 88888);
		//k.display();
		
		k.delete1(4);
		k.display();
		
	}

}

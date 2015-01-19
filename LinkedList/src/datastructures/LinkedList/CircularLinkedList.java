package datastructures.LinkedList;

public class CircularLinkedList {
	
	public static void main(String [] args){
		LinkedList linkedList = new LinkedList();
		System.out.println(linkedList.isEmpty());
		linkedList.addLast("0");
		linkedList.addLast("1");	
		linkedList.addLast("2");
		linkedList.addLast("3");
		linkedList.addLast("4");
		linkedList.addLast("5");
		//linkedList.createCircularLink("6");
		linkedList.printLinkedList();
		CircularLinkedList c = new CircularLinkedList();
		System.out.println(c.determineCircularList(linkedList));
		
	}
	
	public boolean determineCircularList(LinkedList l){
		Node slow = l.head;
		Node faster = l.head.getNextNode();
		
		while(true){	
			System.out.println("slow"+slow.getNodeData());
			System.out.println("fast"+faster.getNodeData());
			
			if(faster==null || faster.getNextNode()==null){
				return false;
			}else if(faster==slow || faster.getNextNode() == slow){
				return true;
			}else{				
				slow=slow.getNextNode();
				faster=faster.getNextNode().getNextNode();
			}
		}
		
		
	}
}

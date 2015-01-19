package datastructures.LinkedList;

public class DoubleLinkedList {
	private Node head=null;
	private Node tail=null;
	
	DoubleLinkedList(){
	//	head.setNextNode(null);
	//	head.setPreviousNode(null);
	}
	
	public boolean isEmpty(){
		return head==null;
		
	}
	public void addFirst(String data){
		Node newNode = new Node(data);
		if(isEmpty()){
			head=newNode;	
			tail=newNode;
		}else{	
			newNode.setNextNode(head);
			head.setPreviousNode(newNode);
			head = newNode;
		}	
	}
	
	public void addLast(String data){
		Node newNode = new Node(data);
		if(isEmpty()){
			head=newNode;	
			tail=newNode;
		}else{	
			newNode.setPreviousNode(tail);
			tail.setNextNode(newNode);
			tail = newNode;
		}	
	}
	
	public void insertBefore(String data, String newData){
		if(this.isEmpty()){
			head=new Node(newData);
		}else{
			Node currentNode = head;
			while(currentNode!=null){
				if(currentNode.getNodeData().equals(data)){
					Node newNode = new Node(newData);
					newNode.setNextNode(currentNode);					
					if(currentNode == head){
						head=newNode;
					}else{
						newNode.setPreviousNode(currentNode.getPreviousNode());	
						currentNode.getPreviousNode().setNextNode(newNode);
						currentNode.setPreviousNode(newNode);
					}
					break;					
				}
				currentNode = currentNode.getNextNode();				
			}
		}
	}

	public void insertAfter(String data, String newData){
		if(this.isEmpty()){
			head=new Node(newData);
			tail=head;
		}else{
			Node currentNode = head;		
			while(currentNode!=null){
				if(currentNode.getNodeData().equals(data)){
					Node newNode = new Node(newData);	
					newNode.setPreviousNode(currentNode);
					newNode.setNextNode(currentNode.getNextNode());
					currentNode.setNextNode(newNode);
					if(currentNode==tail)
						tail=newNode;
					else 
						newNode.getNextNode().setPreviousNode(newNode);
					
					break;	
					
				}
				currentNode = currentNode.getNextNode();				
			}
		}
	}
	
	public void remove(String data){
		if(!this.isEmpty()){
			Node currentNode = head;
			while(!currentNode.getNodeData().equals(data))
			{
				currentNode = currentNode.getNextNode();
				if(currentNode==null)
					break;
			}
			if(currentNode==head){				
				//currentNode.setPreviousNode(null);
				head = currentNode.getNextNode();
				
			}else{
				currentNode.getPreviousNode().setNextNode(currentNode.getNextNode());
			}
			
			if(currentNode==tail){
				tail = currentNode.getPreviousNode();
				//tail.setNextNode(null);
			}else{
				currentNode.getNextNode().setPreviousNode(currentNode.getPreviousNode());
			}			
		
		}
		
	}
	
	public void printLinkedList(){
		Node node = head;
		while(node!=null){
			System.out.println(node.getNodeData());
			node = node.getNextNode();
		}		
	}	
	
	public static void main(String[] args){
		DoubleLinkedList dblLinkedList = new DoubleLinkedList();
		System.out.println(dblLinkedList.isEmpty());
		dblLinkedList.addFirst("3");
		dblLinkedList.addFirst("2");
		dblLinkedList.insertBefore("2","1");
		dblLinkedList.insertBefore("3","4");
		dblLinkedList.insertAfter("3","5");
		dblLinkedList.addFirst("0");
		dblLinkedList.insertBefore("1","9");
		//dblLinkedList.printLinkedList();
	//	System.out.println("-----------------------------------");
		dblLinkedList.remove("3");
	//	dblLinkedList.printLinkedList();
		dblLinkedList.addLast("12");
	//	dblLinkedList.printLinkedList();
		//System.out.println("-----------------------------------");
		dblLinkedList.addLast("14");
		//System.out.println("-----------------------------------");
		dblLinkedList.insertAfter("12","5");
		//System.out.println(dblLinkedList.isEmpty());
		dblLinkedList.printLinkedList();
		
		}
}

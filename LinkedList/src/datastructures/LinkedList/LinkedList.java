package datastructures.LinkedList;

import datastructures.LinkedList.Node;
import java.util.Iterator;

public class LinkedList {
	public Node head = null;
	
	LinkedList(){
		head = null;
	}
	
	private class LinkedListIterator implements Iterator<String> {
		  private Node current;

		  private LinkedListIterator() {
		    current = head;  // from the enclosing class --
		                     // ListIterator cannot be a static class
		  }

		  public boolean hasNext() {
		    return (current != null);
		  }

		  public String next() {
		    if (hasNext()) {
		      String result = current.getNodeData();
		      current = current.getNextNode();   // may be null
		      return result;
		    }  // no next element
		    throw new java.util.NoSuchElementException("linked list.next");
		  }

		  public void remove() {
		    throw new UnsupportedOperationException
		                  ("Linked list iterator remove not supported");
		  }

	}
    public void reverse() {
        if(isEmpty()) { return;}    //curr == null
        Node currNode,nextNode , loopNode;
        currNode = head; 
        nextNode = head.getNextNode(); 
        head.setNextNode(null);

        while(nextNode != null) {
            loopNode = nextNode.getNextNode();
            nextNode.setNextNode(currNode);
            currNode = nextNode;
            nextNode = loopNode;
        }
        head = currNode;
    }
    
    
	public void remove(String data){
		Node currentNode = head;
		Node previousNode = head;
		while(currentNode!=null){
			if(currentNode.getNodeData().equals(data)){
				previousNode.setNextNode(currentNode.getNextNode());
				currentNode.setNodeData(null);
				currentNode.setNextNode(null);
				currentNode = null;
				break;
			}
			previousNode = currentNode;
			currentNode = currentNode.getNextNode();			
		}
	}
	
	public void addFirst(String data){
		if(this.isEmpty())
			head=new Node(data);
		else{
			Node newHead = new Node(data);
			newHead.setNextNode(head);
			head = newHead;
		}
	}	
		
	public void createCircularLink(String a){
		if(this.isEmpty())
			head=new Node(a);
		else{
			Node currentNode = head;		
			while(currentNode.getNextNode()!=null){
				currentNode = currentNode.getNextNode();				
			}
			currentNode.setNextNode(new Node(a));
			Node newNode = currentNode.getNextNode();
			newNode.setNextNode(head);
		}
		
		
	}
	public void addLast(String data){
		if(this.isEmpty())
			head=new Node(data);
		else{
			Node currentNode = head;		
			while(currentNode.getNextNode()!=null){
				currentNode = currentNode.getNextNode();				
			}
			currentNode.setNextNode(new Node(data));
		}
	}
	
	public void insertAfter(String data, String newData){
		if(this.isEmpty())
			head=new Node(newData);
		else{
			Node currentNode = head;		
			while(currentNode!=null){
				if(currentNode.getNodeData().equals(data)){
					Node newNode = new Node(newData);
					newNode.setNextNode(currentNode.getNextNode());
					currentNode.setNextNode(newNode);
					break;					
				}
				currentNode = currentNode.getNextNode();				
			}
		}
		
	}
	
	public void insertBefore(String data, String newData){
		if(this.isEmpty())
			head=new Node(newData);
		else{
			Node currentNode = head;
			Node previousNode = head;
			while(currentNode!=null){
				if(currentNode.getNodeData().equals(data)){
					Node newNode = new Node(newData);
					newNode.setNextNode(currentNode);
					if(currentNode == head){
						head=newNode;
					}else{
						previousNode.setNextNode(newNode);
						
					}
					break;					
				}
				previousNode = currentNode;
				currentNode = currentNode.getNextNode();				
			}
		}
		
	}
	
	public boolean isEmpty() {
	    return head==null;
	 }
	
	public Iterator<String> iterator(){
		return new LinkedListIterator();
		
	}
	
	public void printLinkedList(){
		Node node = head;
		while(node!=null){
			System.out.println(node.getNodeData());
			node = node.getNextNode();
		}		
	}	
	
	public static void main(String[] args){
		LinkedList linkedList = new LinkedList();
		System.out.println(linkedList.isEmpty());
		linkedList.addLast("a1");
		linkedList.addLast("a2");
		linkedList.insertAfter("a2","a3");
		linkedList.insertAfter("a3","a4");
		linkedList.insertBefore("a1","a0");	
		linkedList.insertBefore("a3","a2.5");	
		linkedList.addLast("a5");
		linkedList.addLast("a6");
		linkedList.addLast("a7");
		linkedList.addLast("a8");
		linkedList.addLast("a9");
		linkedList.printLinkedList();
		linkedList.remove("a9");
	//	linkedList.printLinkedList();
		Iterator<String> itr = linkedList.iterator();
		/*while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		System.out.println(linkedList.isEmpty());
		linkedList.reverse();
		linkedList.printLinkedList();
	}
	
}

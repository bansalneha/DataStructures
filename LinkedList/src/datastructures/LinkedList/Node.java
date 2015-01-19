package datastructures.LinkedList;

class Node {
	
	private String data = null;
	private Node nextNode = null;
	private Node previousNode =null;
	
	public Node(String data){
		this.data=data;
		this.nextNode=null;
		this.previousNode=null;
	}
	
	public String getNodeData(){
		return this.data;		
	}
	
	public void setNodeData(String newData){
		this.data = newData;		
	}
	
	public Node getNextNode(){
		return this.nextNode;		
	}
	public void setNextNode(Node newNextNode){
		this.nextNode = newNextNode;
		
	}
	public Node getPreviousNode(){
		return this.previousNode;		
	}
	public void setPreviousNode(Node newPreviousNode){
		this.previousNode = newPreviousNode;
		
	}
	
}

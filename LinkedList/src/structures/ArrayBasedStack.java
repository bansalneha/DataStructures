package structures;

public class ArrayBasedStack {
	private int topOfStack;
	private int[] stackArray;
	
	ArrayBasedStack(int noOfElements){
		stackArray = new int[noOfElements];
		topOfStack = -1;
	}
	
	public boolean isEmpty(){
		return (topOfStack == -1);
		
	}
	
	public void push(int value){
		if(topOfStack == stackArray.length){
			System.out.println("Stack Full. Can not add more.");
			
		}else{
			stackArray[++topOfStack] = value;
		}
		
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty.");
			return -1;
		}
		return stackArray[topOfStack--];		
	}
	
	public int peek(){
		if(isEmpty()){
			System.out.println("Stack is Empty.");
			return -1;
		}
		return stackArray[topOfStack];
			
	}
	
	public static void main(String[] args){
		ArrayBasedStack stack = new ArrayBasedStack(3);
		System.out.println(stack.isEmpty());
		stack.push(3);
		stack.push(2);
		stack.push(1);
		stack.push(0);
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());System.out.println(stack.pop());System.out.println(stack.isEmpty());
	}
	
}

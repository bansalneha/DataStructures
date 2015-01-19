package structures;

import java.lang.reflect.Array;

public class GenericStack<T> {
	private int topOfStack;
	private T[] stackArray;
	
	GenericStack(Class<T[]> c, int noOfElements){
		stackArray = c.cast(Array.newInstance(c.getComponentType(),noOfElements));
		topOfStack = -1;
	}
	
	public boolean isEmpty(){
		return (topOfStack == -1);
		
	}
	
	public void push(T value){
		if(topOfStack == stackArray.length){
			System.out.println("Stack Full. Can not add more.");
		}else{
			stackArray[++topOfStack] = value;
			}
		
	}
	
	public T pop(){
		if(isEmpty()){
			System.out.println("Stack is Empty.");
			return null;
		}
		return stackArray[topOfStack--];		
	}
	
	public T peek(){
		if(isEmpty()){
			System.out.println("Stack is Empty.");
			return null;
		}
		return stackArray[topOfStack];
			
	}
	public static void main(String[] args){
		GenericStack<String> stack = new GenericStack<String>(String[].class,3);
		System.out.println(stack.isEmpty());
		stack.push("Neha");
		stack.push("Nonu");
		stack.push("Mottu");
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());System.out.println(stack.pop());System.out.println(stack.isEmpty());
	}
}

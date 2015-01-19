package structures;

public class ArrayBasedQueue {
	private int[] queueArray;
	private int front;
	
	ArrayBasedQueue(int capacity){
		queueArray = new int[capacity];
		front=0;
	}
	
	public boolean isEmpty(){
		return (front == 0);
	}
	
	public void enqueue(int value){
		if(front == queueArray.length){
			System.out.println("Queue full");
		}else{
			//System.out.println("size " +size);
			queueArray[front++]=value;
		//	System.out.println("in array "+queueArray[size-1]);
		//	System.out.println("size " +size);
		//	System.out.println();
		}
		
	}
	
	public int dequeue(){
		if(front == 0){
			System.out.println("Queue Empty");
			return 0;
		}
		//System.out.println("front " +front);
		int a = queueArray[0];
		front--;
		for (int scan=0; scan < front; scan++)
			queueArray[scan] = queueArray[scan+1];
		return a;
		
	}
	public static void main(String[] args){
		ArrayBasedQueue queue = new ArrayBasedQueue(5);
		System.out.println(queue.isEmpty());
		queue.enqueue(1);
		System.out.println(queue.dequeue());
		queue.enqueue(2);
		System.out.println(queue.dequeue());
		queue.enqueue(3);
		System.out.println(queue.dequeue());
		queue.enqueue(4);
		System.out.println(queue.dequeue());
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		queue.enqueue(8);
		queue.enqueue(9);
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.isEmpty());
	}
}

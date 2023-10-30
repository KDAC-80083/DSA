
public class Queue {

	private int rear = 0;
	private int front = 0;
	private int size;
	private int arr[];

	public Queue() {
		// TODO Auto-generated constructor stub
	}

	public Queue(int size) {

		// this.rear = rear;
		this.size = size;
		arr = new int[size];
		// this.front = front;

	}

	public void push(int ele) {
		
		arr[rear] = ele;
		rear++;

	}

	public void peek() {
		System.out.println("Ele is " + arr[front]);
	}

	public void pop() {
		front++;
	}

	public boolean isEmpty() {
		if (rear == front) {
			System.out.println("Queue Is Empty!");
			return false;
		} 
		else {
			return true;
		}

	}

	public boolean isFull() {
		if (rear == size ) {
			System.out.println("Queue Is Full!");
			return false;
		} else {
			return true;
		}

	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}

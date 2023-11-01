

public class Stack {
	private int arr[];
	private int top=-1;
	private int max=0;
	private final int SIZE;
	
	
	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}
	
//	public Stack() {
//		// TODO Auto-generated constructor stub
//	}
	
	public void push(int data) {
		
		top++;
		arr[top] = data;
		if(max<data)
		{
			max = data;
		}
	}
	
	public int pop() {
		
		int data = arr[top];
		
		top--;
		
		return data;
	}
	
	public int peek() {
		
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == SIZE -1;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	

}










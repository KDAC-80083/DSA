
public class Stack {
	private int top;
	private int size;
	int arr[];
	//private int data;
	
	
	public Stack(int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		arr = new int[size];
		this.top = size-1;
	}
	
	public void push(int data)
	{
		
		arr[top] = data;
		top--;
		
	}
	
	public void pop()
	{
		//top++;
		size--;
		
	}
	
	
	public void peek()
	{
		System.out.println("Top Most Element is "+arr[size-1]);
	}
	
	public boolean isFull()
	{
		if(top ==-1)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public boolean isEmpty()
	{
		if(top == size-1)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	
	

}

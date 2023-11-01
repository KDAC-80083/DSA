import java.util.Scanner;

public class StackInt {
	
	public static int menu()
	{
		int choice;
		System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
		System.out.print("Enter your choice : ");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size!");
		int size = sc.nextInt();
		//int arr[] = new int[size];
		Stack s = new Stack(size);
		int choice;
		
		while((choice = menu())!=0)
		{
			switch(choice)
			{
			case 1:
				if(!s.isFull())
				{
					System.out.println("Enter data!");
					int data = sc.nextInt();
					s.push(data);
				}
				
				else
				{
					System.out.println("Stack is OverFlow!");
				}
				break;
				
			case 2:
				
				if(!s.isEmpty())
				{
					s.pop();
				}
				
				else
				{
					System.out.println("Stack is Underflow!");
				}
				break;
				
				
			case 3:
					if(!s.isEmpty())
					{
						s.peek();
					}
				
				break;
			
			}
		}

	}

}

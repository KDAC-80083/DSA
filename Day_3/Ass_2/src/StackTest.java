

import java.util.Scanner;

public class StackTest {

	public static void main(String[] args) {
		Stack st = new Stack(5);
		//Stack e = new Stack();
		int choice;
		

		Scanner sc  = new Scanner(System.in);
		do {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek\n4. MAX");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				if(st.isFull())
					System.out.println("Stack is full");
				else {
					System.out.print("Enter data : ");
					int data = sc.nextInt();
					st.push(data);
				}
				break;
			case 2:
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Poped Data = " + st.pop());
				break;
			case 3:
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Peeked Data = " + st.peek());
				break;
				
			case 4:
				System.out.println("Max element is "+st.getMax());
				break;
			}
		}while(choice != 0);
		
		sc.close();
	}

}




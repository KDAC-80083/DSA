import java.util.*;

public class TestQueue {

	public static int menu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("0.EXIT");
		System.out.println("1.PUSH");
		System.out.println("2.POP");
		System.out.println("3.PEEK");
		System.out.println("Enter Choice...");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {

		int choice;
		Queue q  = new Queue(3); 
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				Scanner sc = new Scanner(System.in);
				if(q.isFull()) {
				System.out.println("Enter Element to Push:");
				int data = sc.nextInt();
				q.push(data);
				System.out.println("Element Pushed:");
				}

				break;

			case 2:
				if(q.isEmpty()) {
				q.pop();
				System.out.println("Element Popped:");
				}
				break;

			case 3:
				q.peek();

				break;

			default:
				System.out.println("Wrong Input!!");
				break;
			}
		}

	}

}

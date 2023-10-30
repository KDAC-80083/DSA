
public class Array {

//	public static void sum(int arr[]) {
//		// int key =11;
//		int key = 4;
//		double tar = 0;
//		for (int i = 0; i < 8; i++) {
//			// System.out.println("I loop");
//			for (int j = 0; j < 8; j++) {
//				// System.out.println("J loop");
//				tar = tar + arr[j];
//				if (tar == key) {
//					System.out.println("Starting " + (++i) + "Ending" + j);
//					return;
//				}
//			}
//			if (tar != 0) {
//				tar = 0;
//			}
//		}
//	}
	
	public static void sim(int arr[])
	{
		int key=4;
		for(int i=0 ;i<arr.length;i++)
		{
			for(int j =i+1 ;j<=arr.length;j++)
			{
				int sum=0;
				
				for(int k =i;k<=j;k++)
				{
					sum=arr[k]+sum;
				}
				
				if(sum==key)
				{
					System.out.println("i"+i+"j"+j);
					return;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 4, 2, 2, 1, 6, 5 };
		sim(arr);
		//System.out.println("khatam ");
	}

}


public class Ques4 {
	
	public static void occurance(int arr[],int key)
	{
		int count=0;
		for(int i =0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,89,78,10,89,10,78,10,10};
		int key = 10;
		occurance(arr,key);

	}

}

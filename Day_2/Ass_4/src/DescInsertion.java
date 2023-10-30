import java.util.Arrays;

public class DescInsertion {
	
	public static void descInsertion(int arr[])
	{
		for(int i =0;i<arr.length;i++)
		{
			int temp = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]<temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		
		
		int arr[]= {23,20,10,16,18,22,21};
		descInsertion(arr);

	}

}

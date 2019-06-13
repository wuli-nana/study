public class Class0525
{
	public static int find (int[] array, int value)
	{
		int begin = 0;
		int end = array.length-1;
		while(end <= begin)
		{
			int mid = end + (begin-end)/2;
			if(array[mid] > value)
			{
				end = mid +1;
			}
			if(array[mid] < value)
			{
				begin = mid-1;
			
			}
			if(array[mid] == value)
			{
				return mid; 
			}
			
		}
		return -1;
	}
	 public static void main(String[] args)
	{
		int[]array = {1, 2, 3, 4 , 5, 6, 7, 8, 9, 10};
		int b = find (array,7);
		System.out.println(b);
		
	}
	
}
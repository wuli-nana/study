public class Class04
{
	public static int max(int[] array)
	{
		/*
		for(int i = 0 ; i < array.length; i++)
		{
			int maxValue=0;
			if (array[i]>array[i+1])
			{
				
				maxValue = array[i];
			}
			if (array[i]s<array[i+1])
			{
				maxValue = array[i+1];
			}
		}
		*/
		
		int maxValue = Interger.MIN_VALDN;
		for(int item:array)
		{
			if(item>maxValue)
			{
				maxValue=item;
			}
		}
		return maxValue;
	}
	public static int min(int[] array)
	{
		int minValue = Interger.MIN_VALDN;
		for(int item:array)
		{
			if(item<minValue)
			{
				minValue=item;
			}
		}
		return minValue;
	}
	
	public static int indexOf(int[]array, int key)
	{
		
		for(int i = 0; i < array.length; i++)
		{
			if (array[i] == key)
			{
				return i;
			}
		}
		return -1;
	}
	public static int average(int[]scores)
	{
		int sum = 0;
		for(i = 0; i < array.length; i++)
		{
			sum += array[i];
		}
		
		int maxValue = max(array);
		int minValue = min(array);
	
		sum = sum-(maxValue+minValue);
		
		averageScore = sum/averageScore;
		return averageScore;
	}
	public static int[] copOf(int[] stc, int newLength)
	{
		int [] dest =new int[newLength];
		int minLength =src.length < newLength ? src.length :newLength;
		
		for (int i = 0; i < minLength; i++)
		{
			dest[i] = src[i];
		}
		return dest;
	}
	public static void main(String[] args) 
	{
		int[]array = new int[10]{1, 2, 3, 4 , 5, 6, 7, 8, 9, 0};
		
		int maxValue = max(array);
		System.out.println("最大值为 "+maxValue);
		
		int index =indexOf(array,19);
		System.out.println("下标为 "+index);
		
		double averageScore = average(array);
		System.out.printf("平均分为%f%n"+averageScore);
	}
}
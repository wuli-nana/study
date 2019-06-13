import java.util.Arrays;
public class Class05
{
	
	//二分查找
	/*
	public static int find(int[]array , int key)
	{
		int left = 0,right = array.length;
		while(left < right)
		{
			int mid = left + (right - left)/2;
			if(key > array[mid])
			{
				left = mid+1;
				//区间为左闭右开
			}
			
			if(key < array[mid])
			{
				right = mid;
			}
			if(key == array[mid])
			{
				return mid;
			}
			
		}
		
		return -1;
	}
	*/
	
	//交换array数组i和j的下标的位置
	//可以改变是因为指向的是同一个共同体
	/*public static void swap(int[]array,int i,int j)
	{
		int temp = 0;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
			
	}
	public static void bubbleSort(int[]array)
	{
		
		boolean isSwapped = false;
		for(int i = 0; i < array.length; i++ )
		{
			for(int j = 0; j < array.length - i - 1; j++)
			{
				if(array[j] > array[j+1])
				{
					swap(array, j, j+1);
					isSwapped = true;
				}
			}
		}
		if(!isSwapped)
		{
			return;
		}
		
	}
	*/
	public static void main(String[] args)
	{
		//二分查找
		/*int[]array = {0, 1, 2, 3, 4, 5, 6, 7, 8 , 9,} ;
		int findkey = find(array, 7);
		System.out.printf("找到了，下表为"+findkey);
		*/
		/*
		int []array = {23,45,67,89,34,12,78,90,45,14,15};
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
		*/
		
	}
}
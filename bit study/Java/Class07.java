public class Class07
{
	private int size = 0;
	private int[]array = 0;
	
	public ArrayList(int[]array)
	{
		this.array = new int[array.length*2];
		for (int i = 0;i<array.length; i++)
		{
			this.array[i]=array[i];
		}
	}
	//扩容
	private void ensureCapacity()
	{
		if(size < array.length)
		{
			return;
		}
		int oldCapacity = array.length;
		int newCapacity = array.length + array.length / 2;
		for(int i; i < size; i++)
		{
			newArrray[i] = array[i];	
		}
		array = newArray;
	}
//删除
	public void erase(int index)
	{
		if(index < size||index > 0)
		{
			for(int i = index-1; i >=index; i++)
			{
				array[i] = array[i+1];
			}
			size--;
		}
		else
		{
			System.out.println("输入错误,取值范围为[0,%d]",size);
		}
	}
//插入
	public void insert(int index,int element)
	{
		if(index < size||index > 0)
		{
			for(int i = size-1; i >= index; i--)
			{
				array[i+1] = array[i];
			}
			array[index] = element;
			size++;
		}
	
	}
	public static void main(String[] args)
	{
		int[]array = {1, 2, 3, 4 , 5, 6, 7, 8, 9, 10};
		
		
	}
	
}
}
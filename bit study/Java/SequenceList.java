import java.util.Arrays;

public class SequenceList
{
	
	private int[]array;
	private int size;
	
	public seqlist()
	{
		array = new int [11];
		size = 0;
			
	}
	//插入
	//头插
	public void pushiFront(int element)
	{
		for(int i=size-1;i>=0;i--)
		{
			array[i+1]=array[i];
			
		}
		array[0]=element;
		size++;
		
	}
	
	//尾插，不考虑插不下
	public void pushBack(int element)
	{
		array[size++]=element;	
	}
	//中间插
	public void insert(int index,int element)
	{
		for(int i = size-1; i >= index; i--)
		{
			array[i+1] = array[i];
		}
		/*
			for(int i;i < size-index-1;i++)
				//i为循环次数
			{
				array[size-1]=array[size-i-1]
			}
		*/
		array[index] = element;
		size++;
	}
	/*public void insert(int index,int element)
	{
		if(index < 0)
	}
	*/
	//头删
	public void popiFront(int element)
	{
		if(size==0)
		{
			return -1
		}
		for(int i = 0;i < size-1;i++)
		{
			array[i] = array[i+1];
		}
		array[size--] = 0;
	}
	//尾删
	public void popBack(int element)
	{
		array[size--] = 0;
		
	}
	//指定删除
	public void erase(int index，int element)
	{
		for(int i = index-1;i < size-1;i++)
		{
			array[i] = array[i+1];		
		}
		array[size--] = 0;		
	}
	//输出打印
	//查找
	public int indexOf(int element)
	{
		
		return -1;
	}
	//获取数字
	public int get (int index)
	{
		return -1;
	}
	public void set (int index,int element)
	{
	}
	
	public String toString()
	{
		return Arrays.toString(
		Arrays.copyOf(array,size));
	} 
	public 
	public static void main(String[] args)
	{
		String.SequenceList = new SequenceList()
		//插入
		pushForont(10);
		pushForont(20);
		
		pushBack(25);
		pushBack(40);
		
		insert(45,7);
		insert(89,5);
		
		
	}
}
interface List {
	
	
	// 插入
	void pushFront(int val);
	void pushBack(int val);
	void insert(int index, int val);
	
	
	//删除
	/*
	void popFront(int val);
	void popBack(int val);
	void erase(int index);
	
	//返回数据个数
	*/
	int size();
	/*	
	//根据下标访问或修改
	int get(int index)
	void set(int index, int val);
	*/
	
	void display();
}
//抽象类

abstract class AbstractList implements List {
	protected int size;
	
	@Override
	public void pushFront(int val) {
		insertInternal(0,val);
	}
	
	@Override
	public void pushBack(int val){
		insertInternal(size, val);
	}
	
	@Override 
	public void insert(int index, int val) {
		if (index < 0 || index > size){
			System.out.println("下标错误");
			return;
		}
		
		insertInternal(index, val);	
	}
	
	abstract void insertInternal(int index, int val);
	
	@Override
	public int size() {	
		return size;
	}
	
	
}

class ArrayList extends AbstractList 
//implements List, RandomAccess 
{
	public int[] array = new int[100];
	
	@Override
	protected void insertInternal(int index, int val){
		//不考虑扩容问题
		for(int i = size; i > index; i--){
			array[i] = array[i - 1];	
		}
		
		array [index] = val;
		size++;
	}

	@Override 
	public void display() {
		for (int i = 0; i < size;i++){
			System.out.println(array[i]);
		}
	}	
	
}

public class ListByInterface{
	private static  void testList(List list){
		list.pushBack(1);
		list.pushBack(2);
		list.pushFront(10);
		list.insert(3,100);
		list.display();
	}
	
	public static void main (String[] args){
		testList(new ArrayList());
	}
}
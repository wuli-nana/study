import java.util.Arrays;

public class ArrayList{
	private int size = 0;
	private int[] array;
	
	public ArrayList(){
		array = new int[10];
	}
	
	public ArrayList(int array[]){
		this.array = new int [array.length];
		
		for(int i = 0; i < array.length; i++){
			this.array[i] = array[i];
		}
		size = array.length;
	}
	//插入
	public void insert(int index,int elem){
		if(index < 0 || index > size){
			System.out.println("输入坐标有误，取值范围为[0,size]");
			return;
		}
		//进行扩容
		ensureCapacity();
		for(int i = size-1 ; i >= index-1; i--){
			array[i+1] = array[i];
			
		}
		array[index - 1] = elem;
		size++;
	} 
	//删除
	public void delete (int index){
		if(index < 0 || index > size){
			System.out.println("输入坐标有误，取值范围为[0,size]");
			return;
		}
		for(int i = index - 1 ; i < size - 1; i++){
			array[i] = array[i + 1];
		}
		size--;
	}
	
	public void ensureCapacity (){
		if(size > array.length){
			return;
		}
		int oldCapacity = array.length;
		int newCapacity = oldCapacity + oldCapacity / 2;
		int newArray[] = new int [newCapacity];
		
		for(int i = 0; i < array.length; i++){
			newArray[i] = array[i];
		}
		
		array = newArray;
	}
	
	public String toString() {
		return Arrays.toString(
			Arrays.copyOf(array, size)
		);
	}
	
	public static void main(String[] args){
		int[] array = {10, 9, 7, 5, 5, 4};
		ArrayList arrayList = new ArrayList(array);
		System.out.println(arrayList.toString());
		arrayList.insert(5, 106);	
		System.out.println(arrayList.toString());
		arrayList.delete(1);
		System.out.println(arrayList.toString());		
	}
}
//调整数组中元素的位置，使得奇数位于偶数之前
//示例数组：int[] array = {1,2,3,4,5,6,7,8,9};
//将奇数放在偶数前面，无需关心变化后的数据是否有序

public class VacationTest01 {
	public void order(int[] arr){
		if(arr == null)
			return;
		int i = 0;
		int j = arr.length-1;
		while(i<j){
			if(isEven(arr[i]) && !isEven(arr[j])){
				int temp = arr[i];
				arr[i]= arr[j];
				arr[j] = temp;
			}
			else if(!isEven(arr[i]) && isEven(arr[j])){
				i++;
			}
			else if(isEven(arr[i]) && isEven(arr[j])){
				j--;
			}else{
				i++;
				j--;
			}
		}
	}
	public boolean isEven(int n){
		return (n & 1) == 0;
	}
	public static void main(String[] args){
		VacationTest01 test = new VacationTest01();
		int[] arr= {1,2,3,4,5,6,12,7,8,9,10};
		test.order(arr);
		for(int i = 0;i<arr.length ;i++){
			System.out.print(arr[i]+",");
		}
	}
}

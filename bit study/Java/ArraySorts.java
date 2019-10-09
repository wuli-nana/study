import java.util.Arrays;
import java.util.Random;

public class ArraySorts {
    public static int[] buildArray (int n){
        Random random = new Random(2019102);
        int[] array = new int[n];
        for(int i = 0;i< n-1;i++){
            array[i] = (random.nextInt())%100;
        }
        return array;
    }
    //插入排序
    public static void insertSort1(int array[]){
        for(int i = 1; i < array.length-1;i++){
            int key = array[i +1];
            int j;
            for(j = i;j >= 0;j--){
                if(key > array[j]){
                    break;
                }
            }
            for(int k = i;k> j;k--){
                array[k+1]= array[k];
            }
            array[j+1]= key;
        }
    }
    //插入排序，改进循环。
    public static void insertSort2(int[] array){
        for(int i = 0;i< array.length - 1;i++){
            int key = array[i + 1];
            int j;
            for(j = i;j > 0 && key < array[j];j--){
                array[j+1]= array[j];
            }
            array[j+1]= key;
        }
    }
    //交换函数
    public static void swap (int[] array,int i ,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    //冒泡排序
    public static void insertSort3(int[] array){
        for(int i = 0;i < array.length-1; i++){
            for(int j = 1;j < i;i++){
                if (array[i] > array[j]){
                    swap(array,i,j);
                }
            }
        }
    }

    /**
     * 每次选择最大的数
     * 有序区间为[array.length-i,array.length)
     * 无序区间为[0,array.length-i]
     * @param array 待排序的数组
     */
    public static void insertSort4(int[] array){
        for(int i = 0;i< array.length-1;i++){
            int max = 0;
            for(int j = 1;j < array.length - i;j++ ){
                if(array[j] > array[i]){
                    max = j;
                }
            }
            swap(array,max,array.length-i);
        }
    }
    public static void insertSortWithGap(int[] array,int gap){
        for(int i = 0;i < array.length - gap; i++){
            int key = array[i + gap];
            int j;
            for(j = i;j>=0 && key < array[j];j -=gap){
                array[j+gap] = array[j];
            }
            array[j+gap] = key;
        }
    }

    /**
     * 希尔排序
     * @param array 待排序的数组
     */
    public static void insertSort5(int[] array){
        int gap = array.length;
        while(gap != 1){
            gap = gap / 3 + 1;
            insertSortWithGap(array,gap);
        }
    }
    public static void main(String[] args) {
        int[] array;
        array = buildArray(20);
        insertSort1(array);
        System.out.println(Arrays.toString(array));
    }
}

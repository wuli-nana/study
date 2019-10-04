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
    public static void main(String[] args) {
        int[] array;
        array = buildArray(20);
        insertSort1(array);
        System.out.println(Arrays.toString(array));



    }
}

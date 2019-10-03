import java.util.Arrays;

public class Sorts {
    public static void insertSort(int array[]){
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
    public static void main(String[] args) {
        int []array={1,2,4,5,7,8,2,4,7};
        insertSort(array);
        System.out.println(Arrays.toString(array));

    }
}

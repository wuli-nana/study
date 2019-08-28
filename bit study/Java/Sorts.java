public class Sorts {
    public static void insertSort(int array[]){
        for(int i = 0;i < array.length;i++){
            //有序区间[0,i]
            //无序区间[i + 1,array.length)
            //待插入的数据是array[i+1]
            int key = array[i+1];
            int j ;
            for(j = i;j >= 0;j--){
                if( key >= array [j]){
                    break;
                }
            }
            //j+1 放在key的位置
            for(int k = i;k > j;k--){
                array[k + 1 ] = array [k];
            }
            array[j] = key;
        }
    }
    //整合版本
    public static void insertSort2(int array[]) {
        for(int i = 0;i < array.length;i++){

            int key = array[i+1];
            int j ;
            for(j = i;j >= 0 && key < array[j];j--){
                array[j + 1 ] = array [j];
            }
            array[j + 1] = key;

        }
    }

    //希尔排序
    public static void shellSort(int[] array,int gap){
         gap = array.length;
         while(true){
             gap = gap / 3 +1;
             inserSortWithGap(array,gap);
             if(gap == 1){
                 return ;
             }
         }
    }
    public static void inserSortWithGap(int[] array,int gap){
        for(int i = 0;i < array.length-gap;i++){
            int k = array[i + gap];
            int j ;
            for(j = i ;j >= 0 && k <array[j];j -= gap ){
                  array [j + gap] = array[i];
            }
            array[j + gap] = k;
        }
    }
    public static void selelctSort(int [] array){
        for(int i = 0;i < array.length -1;i++){
            //无序区间【0，array。length -1，i】
            // 有序区间【array。length -i ，length】
            int max = 0;
            for(int j = 1;j< array.length-i;j++){
                if(array[j]>array[max]){
                    max = j;
                }
            }
            swap(array,max,i);
        }

    }
    private static void swap(int[]array,int n,int m){
        int temp = array[n];
        array[n] = array[m];
        array[m] = temp;
    }

    public static void heapSort (int[] array){
        creatHeap(array,array.length);
        for(int i = 0;i < array.length - 1;i++){
            swap(array,0,array.length-1 )
        }
    }

    // size-1 是最后一个叶子结点，
    // 根据双亲结点为（index - 1 ）/2;
    private static void creatHeap(int[]array,int size){
        for(int i = (size - 2)/2;i >= 0;i--){
            heapsfy(array,size,i);
         }
    }
    private static void heapsfy(int[]array,int size,int k){
        while(true){
            int left = k*2+1;
            //判断是否为叶子结点，
            // 若为叶子结点，则直接返回
            if(left >size){
                return;
            }
            int max = left;
            if(left + 1 < size){
                if(array[max] < array[left+1]){
                    max = left + 1;
                }
                if(array[k] < array[max]){
                    swap(array,max,k);
                    k = max;
                }
            }
        }
    }

}

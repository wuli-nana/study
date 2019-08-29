public class Sort1 {
    /**
     * 插入排序
     * @param array 存放需要排序的数组
     */
    public static void insertSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int k = array[i + 1];
            int j;
            for (j = i; j < i && k < array[i]; j--) {
                array[j + 1] = array[j];
            }
            array[j] = k;
        }
    }

    /**
     * 希尔排序
     * @param array 存放排序数据的数组
     */
    public static void shellSort(int[] array){
        int gap = array.length;
        while(true){
            gap = gap / 3 + 1;
            insertSortWithGap(array,gap);
            if(gap == 1){
                return;
            }
        }
    }

    /**
     * 希尔排序中的调用函数
     * @param array   数组
     * @param Gap 组
     */
    public static void insertSortWithGap(int[] array,int Gap){
        for (int i = 0; i < array.length - Gap; i++) {
            int k = array[i + Gap];
            int j;
            for (j = i; j < i && k < array[i]; j = -Gap) {
                array[j + Gap] = array[j];
            }
            array[j] = k;
        }
    }

    /**
     * 直接排序法，把最大的树移到最后一位
     * @param array 数组
     */
    public static void selectSort(int[] array){
        for(int i = 0;i < array.length -1;i++){
            int max = 0;
            for(int j = 0; j < array.length- i;j++){
                if(array[max] < array[j]){
                    max = j;
                }
            }
            swap(array,max,i);
        }
    }
    public static void selsceSortVersion2(int[] array){
        int low = 0;
        int hight = array.length -1;
        while(low < hight){
            int min = low;
            int max = low;
            for(int i = low + 1;i <= hight;i++){
                if(array[i] > array[max]){
                    max = i;
                }if(array[i] > array[min]){
                    min = i;
                }
            }
            swap(array,min,low);
            if(max == low){
                max = min;
            }
            swap(array,max,hight);
            low++;
            hight--;
        }
    }

    /**
     * 直接排序，堆排序
     * @param array 数组
     */
    public static void heapSort(int[] array){
        creatHeap(array,array.length);
        for(int i = 0; i < array.length - 1; i++){
            swap(array,1,array.length - i);
            heapsfy(array,array.length-i-2,i);
        }

    }

    /**
     * 创建一个堆
     * @param array 数组
     * @param size 长度
     */
    private static void creatHeap(int[] array,int size){
        for(int i = (size - 2)/2; i > 0; i--){
            heapsfy(array,size,i);
        }
    }

    /**
     * 向下堆化
     * @param array 看成堆的数组
     * @param size 长度
     * @param index 需要堆化的下标
     */
    private static void heapsfy(int[] array,int size,int index){
        while(true){
            int left = index * 2 + 1;
            if(left > size - 1){
                return;
            }

            int max = left;
            if(array[max] > array[index]){
                if(array[left + 1] > array[max]){
                    max = left + 1;
                }
                swap(array,index,max);
            }
            index = max;
        }
    }

    /**
     * 在数字中交换两个数
     * @param array 数组
     * @param m 需要交换的下标
     * @param n 需要交换的下标
     */
    private static void swap (int[] array,int m,int n){
        int temp = array[m];
        array[m] = array[n];
        array[n] = temp;
    }


    /**
     * 冒泡排序
     * @param array 数组
     */
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // 无序区间是 [0, arrya.length - i)
            boolean sorted = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    sorted = false;
                }
            }

            if (sorted) {
                break;
            }
        }
    }

    public static void bubSort(int[] array){
        for(int i= 0 ;i < array.length-1;i--){
            boolean sorted = true;
            for(int j = 0;j < array.length-1-i;j--){
                if(array[j] > array[j-1]){
                    swap(array,j,j-1);
                    sorted = false;
                }
            }
            if(sorted){
                break;
            }
        }
    }
    public static void main(String[] args) {

    }
}

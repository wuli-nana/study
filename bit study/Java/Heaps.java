public class Heaps {

    /**
     * 前提：除了 index和他的孩子之外，其他位置已经满足堆化。
     * 经过向下堆化，最终完全称为一个堆
     * 时间复杂度是O（log(n)）
     * @param array 被看作堆的数组
     * @param size 数字中被看作堆的值的个数
     * @param index 需要调整位置的下标
     */

    public static void heapify(int[] array,int size,int index){
        while (true){
            //判断是否为叶子结点
            int left = 2* index +1;
            if(left >= size){
                return;
            }

            int max = left;
            if(left + 1  < size){
                if(array[left + 1] > array[left]){
                        max = left +1;
                }
                if(array[index] >= array[max]){
                    return;
                }
                swap(array,index,max);
                index = max;
            }
        }
    }

    /**
     * 在数组中交换两个数
     * @param array 需要调整的数组
     * @param m 需要调整的下标
     * @param n 需要调整的下标
     */
    public static void swap (int array[],int m,int n){
        int temp = array[m] ;
        array[m] =array[n];
        array[n] = temp;
    }

    /**
     * 创建一个堆
     * @param array 被看成堆的数组
     * @param size 长度
     */
    public static void creatHeap(int[] array,int size){
        for(int i = (size -2)/2; i>= 0; i--){
            heapify(array,size,i);
        }
    }

    /**
     * 向上调整
     * @param array 看成堆的数组
     * @param index 需要调整的下标
     */
    public static void adjustUp(int[] array,int index){
        while(index > 0){
            int parent = (index - 1)/2;
            if(array[parent] >= array[index]){
                return ;
            }
            swap(array,index,parent);
            index = parent;
        }
    }

    /**
     * 小堆的向下堆化
     * @param array 被看作小堆的数组
     * @param size 长度
     * @param index 需要调整的下标
     */
    public static void heapsfyMin (int[] array,int size,int index){
        while(true){
            int left = index * 2 + 1;
            if( left > size){
                return ;
            }
            int min = left;
            if(left + 1 < size){
                if(array[left+1]<array[left]){
                    min = left+1;
                }
                if(array[min] >= array[index]){
                    swap(array,index,min);
                    index = min;
                }
            }
        }
    }
    public static void createHeapMin(int[] array, int size) {
        for (int i = (size - 2) / 2; i >= 0; i--) {
            heapsfyMin(array, size, i);
        }
    }
}



public class Sort1 {
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
    public static void insertGap(int[] array){
        int gap = array.length;
        while(true){
            gap = gap / 3 + 1;
            insertShortWithGap(array,gap);
            if(gap == 1){
                return;
            }
        }

    }
    public static void insertShortWithGap(int[] array,int Gap){
        for (int i = 0; i < array.length - Gap; i++) {
            int k = array[i + Gap];
            int j;
            for (j = i; j < i && k < array[i]; j = -Gap) {
                array[j + Gap] = array[j];
            }
            array[j] = k;
        }
    }

    public static void main(String[] args) {

    }
}

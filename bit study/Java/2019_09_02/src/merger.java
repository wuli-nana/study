public class merger{

        private  static void mergeSortInterional(int[] array,int left,int right){
            if(left + 1 > right){
                return;
            }
            int mid = (left + right ) /2;
            mergeSortInterional(array,left,mid);
            mergeSortInterional(array,mid,right);
            meger(array,left,mid,right);
        }

        public static void meger(int[] array,int low,int mid,int hight) {
            int length = hight - low;
            int[] extra = new int[length];

            int iLeft = low;
            int iRight = mid;
            int iExtra = 0;

            while (iLeft < mid && iRight < hight) {
                if (array[low] > array[mid]) {
                    extra[iExtra++] = array[iLeft++];

                }
                if (array[low] < array[mid]) {
                    extra[iExtra++] = array[iRight++];
                }
                while (iLeft < mid) {
                    extra[iExtra++] = array[iLeft++];
                }
                while (iRight < hight) {
                    extra[iExtra++] = array[iRight++];
                }
                for (int i = 0; i < length; i++) {
                    array[low + i] = extra[i];
                }
            }
        }

        //===============================================================================

}

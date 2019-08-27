import java.util.Random;
import java.util.Arrays;



public class Topk {
    public static void main(String[] args) {
        Random random = new Random(19981211);
        int[] wulin = new int [1000];
        for(int i = 0;i< wulin.length;i++){
            wulin[i] = random.nextInt(1000);
        }
        int[] topK = findTopK(wulin,5);
        System.out.println(Arrays.toString(topK));
        System.out.println("=====================");
        Arrays.sort(wulin);
        System.out.println(Arrays.toString(
                Arrays.copyOfRange(wulin, wulin.length - 10, wulin.length)
        ));
    }
    public static int[] findTopK(int[] wulin,int k){
        int[] heap = new int [k];
        for(int i = 0;i < k;i++){
            heap[i] = wulin[i];
        }
        Heaps.createHeapMin(heap,heap.length);
        for(int i = k;i< wulin.length;i++){
            if(wulin[i] > heap[0]){
                heap[0] = wulin[i];
                Heaps.heapsfyMin(heap,k,0);
            }
        }
        return heap;
    }

}

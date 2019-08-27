import java.util.PriorityQueue;
import java.util.Random;

public class MyPriorityQuene {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue1 = new PriorityQueue<>();
        PriorityQueue<Integer> queue2 = new PriorityQueue<>();

        Random random = new Random(19981211);
        for(int i = 0;i < 10;i++){
            int n = random.nextInt(100);
            queue1.add(n);
            queue2.add(n);
        }
        while (!queue1.isEmpty()){
            System.out.println(queue1.poll());
        }
        System.out.println("====================");
        while (!queue2.isEmpty()){
            System.out.println(queue2.poll());
        }
    }
}

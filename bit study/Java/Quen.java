import java.util.LinkedList;
import java.util.Queue;

public class Quen {

    private Queue<Integer > queue = new LinkedList<>();
    private void push (int element){
        queue.add(element);

    }
    private  int pop(){
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            int temp = queue.poll();
            queue.add(temp);
        }
        return  queue.poll();
    }
    private int top(){
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            int temp = queue.poll();
            queue.add(temp);
        }
        int temp = queue.poll();
        queue.add(temp);
        return  queue.poll();
    }
    public boolean empty(){
        return queue.isEmpty();
    }
}

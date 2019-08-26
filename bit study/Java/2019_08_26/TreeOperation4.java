import java.util.LinkedList;
import java.util.Queue;

public class TreeOperation4 {
    public static void levelOder(Tree root){
        if(root == null){
            return ;
        }

        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);

        while(! queue.isEmpty()) {
            Tree front = queue.poll();
            if (front.left != null) {
                queue.add(front.left);
            }
            if (front.right != null) {
                queue.add(front.right);
            }
        }
    }

    public static 
}

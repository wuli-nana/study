import java.util.ArrayList;
import java.util.List;

public class Tree {
    public static  Node build(){
        Node a  = new Node ('A');
        Node b  = new Node ('B');
        Node c  = new Node ('C');
        Node d  = new Node ('D');
        Node e  = new Node ('E');
        Node f  = new Node ('F');
        Node g  = new Node ('G');
        Node h  = new Node ('H');

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        e.right = h;
        return a;
    }

    public static  void  perOderTraversal (Node root){
        if(root == null){
            return;
        }
        System.out.print("  "+root.val);
        perOderTraversal(root.left);
        perOderTraversal(root.right);
    }
    public static  void inOderTraversal(Node root){
        if(root == null ){
            return;
        }
        inOderTraversal(root.left);
        System.out.print("  "+root.val);
        inOderTraversal(root.right);
    }
    public static  void postOderTraversal (Node root){
        if (root == null){
            return;
        }
        postOderTraversal(root.left);
        postOderTraversal(root.right);
        System.out.print("  "+root.val);

    } 
    public static List<Character> perOderTraversal2(Node root){
        if(root == null) {
            return null;
        }

        List<Character> list = new ArrayList<>();
        List<Character> liftPerOder = perOderTraversal2(root.left);
        List<Character> rightPerOder = perOderTraversal2(root.right);
        list.add(root.val);
        list.addAll(liftPerOder);
        list.addAll(rightPerOder);
        return list;

        }
    public static List<Character>  list ;

    public  static void perOder (Node root){
        if(root == null){
            return;
        }
        list.add(root.val);
        perOder(root.left);
        perOder(root.right);
    }
    public static List<Character> perOderTraversal3(Node root){
        list = new ArrayList<>();
        perOder(root);
        return list;
    }

    public static void main(String[] args) {
        Node root = build();
        perOderTraversal(root);
        System.out.println();
        inOderTraversal(root);
        System.out.println();
        postOderTraversal(root);
        System.out.println();
        System.out.println(perOderTraversal3(root));
        System.out.println();
        System.out.println(perOderTraversal2(root));
    }

}

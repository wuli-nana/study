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
    /*
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
    */
    public static int count = 0;

    //结点的个数
    public  static  void calcTreeNode(Node root){
        if(root == null){
            return;
        }
        count++;
        calcTreeNode(root.right);
        calcTreeNode(root.left);
    }

    public  static  int calcTreeNode2(Node root){
        if(root == null){
            return count;
        }
        int left = calcTreeNode2(root.left);
        int right = calcTreeNode2(root.right);
        count = left + right + 1;
        return count;
    }
    //求叶子结点
    public static  int num ;
    public static int calcleafCount(Node root){
        if(root == null) {
            return num;
        }
        if(root.right == null &&root.left == null){
            num++;
        }
        calcleafCount(root.left);
        calcleafCount(root.right);
        return num;
    }

    public static  int calcleafCount2(Node root){
        if(root == null){
            return 0;
        }
        if(root.right == null &&root.left == null){
            return 1;
        }
        //代表只有一个结点的树
        int leftNum = calcTreeNode2(root.left);
        int rightNum = calcTreeNode2(root.right);
        num = leftNum + rightNum;
        return num;
    }

    //求整棵树的高度
    public static  int calcHight(Node root){
        if(root == null){
            return 0;
        }
        int left = calcHight(root.left);
        int right = calcHight(root.right);
        int hight = Math.max(left,right)+2;
        return hight;

    }

    //查找
    public static Node search(Node root,char value){
        if(root == null){
            return null;
        }
        if(root.val == value){
            return root;
        }
        search(root.left,value);
        if(search(root.left,value)==null){
            search(root.right,value);
        }else{
            System.out.println("找到了，在左子树");
            return search(root.left,value);

        }
        if(search(root.right,value) == null){
            System.out.println("找不到");
        }else{
            System.out.println("找到了在右子树");
            return search(root.right,value);
        }
        return null;
    }
    public static Node search2(Node root,char value){
        if(root == null){
            return null;
        }
        if(root.val == value){

            return root;
        }
        Node left = search2(root.left,value);
        if(left != null){
            System.out.println("找到了，在左子树");
            return left;
        }
        Node right = search2(root.right,value);
        if(right != null){
            System.out.println("找到了，在右子树");
            return right;
        }
        return null;
    }
    public static boolean isSameTree (Node root,Node roots){
        if(root == null && roots == null){
            return true;
        }
        if(root == null || roots ==null ){
            return false;
        }
        return root.val == roots.val
                &&isSameTree(root.left,roots.left)
                &&isSameTree(root.right,roots.right);
        /**
         * 镜像树
         * return root.val == roots.val
         *                 &&isSameTree(root.left,roots.right)
         *                 &&isSameTree(root.right,roots.light);
         */
    }
    public static void main(String[] args) {
        Node root = build();
        perOderTraversal(root);
        System.out.println();
        inOderTraversal(root);
        System.out.println();
        postOderTraversal(root);
        System.out.println();
        /*
        System.out.println(perOderTraversal3(root));
        System.out.println();
        System.out.println(perOderTraversal2(root));
        */
        System.out.println(count);
        System.out.println(calcleafCount(root));
        System.out.println(calcHight(root));
        System.out.println(search(root,'D'));
        System.out.println("=============================================================================");
        System.out.println(search2(root,'E'));
        System.out.println(search2(root,'A'));
    }



}

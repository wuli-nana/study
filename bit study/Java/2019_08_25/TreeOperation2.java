import java.util.List;

public class TreeOperation2 {
    public static Tree buildTree(){
        Tree a = new Tree('A');
        Tree b = new Tree('B');
        Tree c = new Tree('C');
        Tree d = new Tree('D');
        Tree e = new Tree('E');
        Tree f = new Tree('F');
        Tree g = new Tree('G');

        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.right = f;d.left = g;
        return a;
    }

    /**
     * 判断两棵树是否相同
     * @param root 树1
     * @param roots 树2
     * @return 相同返回true，否则返回false
     */
    public static boolean isSame(Tree root,Tree roots){
        if(root == null && roots == null){
            return true;
        }
        if(root == null || roots == null){
            return false;
        }
        return root.value == roots.value
                && isSame( root.left, roots.left)
                && isSame(root.right, roots.right);
    }

    /**
     * 判断镜像树
     * @param root 树1
     * @param roots 树2
     * @return 是返回true，不是返回false
     */
    public static boolean ismirror(Tree root,Tree roots){
        if(root == null && roots == null){
            return true;
        }

        return root.value == roots.value
                &&ismirror(root.left , roots.right)
                &&ismirror(root.right , roots.left);
    }

    /**
     * 前序 + 中序 得到的树
     * @param perOder 前序序列
     * @param inOder 中序序列
     * @return 构建的树
     */
    public static Tree buildTree1(List<Character> perOder,List<Character> inOder){
        if(perOder.size() == 0){
            return null;
        }
        char rootVal = perOder.get(0);
        Tree root = new Tree(rootVal);
        int leftCount = inOder.indexOf(rootVal);

        List<Character> leftPerOder = perOder.subList(1,1+leftCount);
        List<Character> leftInOder = inOder.subList(0,leftCount);
        root.left = buildTree1(leftPerOder,leftInOder);

        List<Character> rightPerOder = perOder.subList(1+leftCount,perOder.size());
        List<Character> rightInder = inOder.subList(leftCount+1,inOder.size()-1);
        root.right = buildTree1(rightPerOder,rightInder);

        return root;
    }

    /**
     * 后序 + 中序 得到的树
     * @param postOder 后序序列
     * @param inOder 中序序列
     * @return 构建的树
     */
    public static Tree buildTree2(List<Character> postOder,List<Character> inOder){
        if(postOder.size() == 0){
            return null;
        }
        char rootVal = postOder.get(postOder.size());
        Tree root = new Tree(rootVal);
        int leftCount = inOder.indexOf(rootVal);

        List<Character> leftPostOder = postOder.subList(0,leftCount);
        List<Character> leftInOder = inOder.subList(0,leftCount);
        root.left = buildTree2(leftPostOder,leftInOder);

        List<Character> rightPostOder = postOder.subList(leftCount,postOder.size()-1);
        List<Character> rightInder = inOder.subList(leftCount+1,inOder.size()-1);
        root.right = buildTree2(rightPostOder,rightInder);

        return root;
    }
    public static void main(String[] args) {
        Tree root = buildTree();
        Tree roots = buildTree();
        System.out.println(isSame(root,roots));
        System.out.println(ismirror(root,roots));
    }


}

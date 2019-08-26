import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeOperation3 {
    /**
     * 前序 + 中序 用数组的形式来展现
     * @param inorder 中序
     * @param peroder 前序
     * @return 返回树
     */
    public static Tree buildTreeArray(char[] inorder, char[] peroder) {
        if (inorder.length == 0) {
            return null;
        }
        char rootVal = peroder[0];
        Tree root = new Tree(rootVal);

        int leftCount = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (rootVal == inorder[i]) {
                leftCount = i;
            }
        }

        char[] leftInorder = Arrays.copyOfRange(inorder, 0, leftCount);
        char[] leftPerOder = Arrays.copyOfRange(peroder, 1, leftCount + 1);
        root.left = buildTreeArray(leftInorder, leftPerOder);

        char[] rightInOder = Arrays.copyOfRange(inorder, leftCount + 1, inorder.length);
        char[] rightPerOder = Arrays.copyOfRange(peroder, leftCount + 1, peroder.length);
        root.right = buildTreeArray(rightInOder, rightPerOder);
        return root;
    }

    /**
     * ReturnVal 类
     * 存放 root used
     */
    public static class ReturnVal{
        Tree root;
        int used;
    }

    /**
     * 只有前序求树
     * @param peroder 前序序列
     * @return 返回 root 和 used
     */
    public static ReturnVal buildPoerder(List<Character> peroder){
        if(peroder.size() == 0){
            ReturnVal rv = new ReturnVal();
            rv.root = null;
            rv.used = 0;
            return rv;
        }
        char rootVal = peroder.get(0);
        if(rootVal == '#'){
            ReturnVal rv = new ReturnVal();
            rv.root = null;
            rv.used = 1;
            return rv;
        }
        ReturnVal leftRV = buildPoerder(peroder.subList(1,peroder.size()));
        ReturnVal rightRV = buildPoerder(peroder.subList(1+leftRV.used,peroder.size()));

        Tree root = new Tree(rootVal);
        root.left = leftRV.root;
        root.right = rightRV.root;

        ReturnVal rv = new ReturnVal();
        rv.root = root ;
        rv.used = 1 + leftRV.used + rightRV.used;

        return rv;
    }

    /**
     *  将树写成（A（D（（）C）））类似的形式
     *  左子树为空，右子树不为空时，（）不能shenglue
     * @param sb StringBuider
     * @param root 树
     */
    public static void perOder (StringBuilder sb,Tree root){
        if(root == null){
            return;
        }
        sb.append('(');
        sb.append(root.value);
        if(root.left == null && root.right == null){
            sb.append("()");
        }else{
            perOder(sb,root.left);
        }
        perOder(sb,root.right);
        sb.append(')');
    }

    /**
     * 字符串输出
     * @param root  树
     * @return 返回字符串
     */
    public static String treeStr(Tree root){
        if(root == null){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        perOder(sb,root);
        String r = sb.toString();
        return r.substring(1,r.length()-1);
    }

    /**
     * 层序遍历
     * @param root 树
     */
    public static void levelOderTraversal (Tree root){
        if(root == null){
            return ;
        }
        Queue<Tree>  queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Tree front = queue.poll();
            System.out.println(front.value);
            if(front.left != null){
                queue.add(front.left);
            }
            if(front.right != null){
                queue.add(front.right);
            }
        }
    }
}

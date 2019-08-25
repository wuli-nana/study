public class TreeOperation {
    public static Tree buildTree(){
        Tree a = new Tree('A');
        Tree b = new Tree('B');
        Tree c = new Tree('C');
        Tree d = new Tree('D');
        Tree e = new Tree('E');
        Tree f = new Tree('F');
        Tree g = new Tree('G');
        Tree h = new Tree('H');

        a.left = b;a.right = c;
        b.left = d;b.right = e;
        c.right = f;
        f.right = h;
        return a;
    }
    /**
     * 前序遍历,打印输出
     * @param root 树
     */
    public static void calcPerOder(Tree root){
        if(root == null){
            return ;
        }
        System.out.print(root.value+"\t");
        calcPerOder(root.left);
        calcPerOder(root.right);
    }

    /**
     * 中序遍历，打印输出
     * @param root 树
     */
    public static void calcInOder(Tree root){
        if(root == null){
            return ;
        }
        calcInOder(root.left);
        System.out.print(root.value+"\t");
        calcInOder(root.right);
    }

    /**
     * 后序遍历 打印输出
     * @param root 树
     */
    public static void calcPostOder(Tree root){
        if(root == null){
            return ;
        }
        calcPostOder(root.left);
        calcPostOder(root.right);
        System.out.print(root.value+"\t");
    }

    public static int calcTreeCount(Tree root){
        if(root == null){
            return 0;
        }
        int leftCount = calcTreeCount(root.left);
        int rightCount = calcTreeCount(root.right);
        int treeCount = leftCount + rightCount +1;

        return treeCount;
    }

    /**
     * 求叶子节点的个数
     * @param root 树
     * @return 返回 Count
     */
    public static int calcleafCount(Tree root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int leftCount = calcleafCount(root.left);
        int rightCount = calcleafCount(root.right);
        return leftCount+rightCount;

    }

    /**
     * 求树的高度
     * @param root 树
     * @return 返回 高度
     */
    public static int calcHight (Tree root){
        if(root == null){
            return 0;
        }
        int leftHight = calcHight(root.left);
        int rightHight = calcHight(root.right);
        int hight = Math.max(leftHight,rightHight) + 1;
        return hight;
    }

    /**
     * 查找val结点
     * @param root 树
     * @param val 寻找val结点
     * @return 找到返回，找不到返回null
     */
    public static Tree seach(Tree root,char val){
        if(root == null){
            return null;
        }
        if(root.value == val){
            return root;
        }
        if(seach(root.left,val) == null){
            if(seach(root.right,val) != null){
                return root;
            }
        }else {
            return root;
        }
        return null;

    }
    public static void main(String[] args) {
        Tree root = buildTree();
        calcPerOder(root);
        System.out.println();
        calcInOder(root);
        System.out.println();
        calcPostOder(root);
        System.out.println();
        System.out.println("该树一共有"
                            +calcTreeCount(root)+"个结点");
        System.out.println("该树的高度为"
                            +calcHight(root));
        System.out.println("该树的叶子结点有"
                            +calcleafCount(root)+"个");
        System.out.println(seach(root,'D'));
        System.out.println(seach(root,'N'));
        System.out.println("========================分隔符========================");
    }
}

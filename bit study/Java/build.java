
import java.util.Arrays;
import java.util.List;

public class build {
    /*
    public static Node buildTree(List<Character> perOder,List<Character> inOder){
        if(perOder.size() == 0){
            return null;
        }
        char rootValue = perOder.get(0);

        int leftCount = inOder.indexOf(rootValue);
        Node root = new Node(rootValue);
        List<Character> liftPerOder = perOder.subList(1,1+leftCount);
        List<Character> leftInOder = inOder.subList(0,leftCount);
        Node left = buildTree(liftPerOder,leftInOder);
        root.left = left;

        List<Character> rightPerOder = perOder.subList(1+leftCount, perOder.size());
        List<Character> rightInOder = inOder.subList(leftCount +1 ,inOder.size());
        Node right = buildTree(rightPerOder,rightInOder);
        root.right = right;
        return root;

    }
    */
    public static Node  build2 (List<Character> inOder ,List<Character> postOder){
        if(postOder.size() == 0){
            return null;
        }
        char rootValue = postOder.get(postOder.size()-1);

        int leftCount = inOder.indexOf(rootValue);
        Node root = new Node(rootValue);

        List<Character> leftInOder = inOder.subList(0,leftCount-1);
        List<Character> leftpostOder = postOder.subList(0,leftCount-1);
        Node left = build2(leftInOder,leftpostOder);
        root.left = left;

        List<Character> rightInOder = inOder.subList(leftCount+1,inOder.size());
        List<Character> rightPostOder = postOder.subList(leftCount,postOder.size()-1);
        Node right = build2(rightInOder,rightPostOder);
        root.right = right;
        return root;

    }
    public static void main(String[] args) {
        List<Character> list1 = Arrays.asList('A','B','D','E','G','C','F','H');
        List<Character> list2 = Arrays.asList('D','B','G','E','A','C','F','H');
        List<Character> list3 = Arrays.asList('D','E','G','B','H','F','C','A');
        List<Character> list4 = Arrays.asList('C','B','E','H','G','I','F','D','A');
        List<Character> list5 = Arrays.asList('B','C','A','E','D','G','H','F','I');

        //Node root = buildTree(list1,list2);
        Node roots = build2(list4,list5);
        System.out.println("成功");
    }
}

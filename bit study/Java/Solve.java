import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> generate (int newRows){
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i < newRows;i++){
            List<Integer> nums = new ArrayList<>();
            nums.add(1);
            for(int j = 0;j <i - 2;i++){
                List<Integer> perNums = list.get(i - 1);
                int p = perNums.get(j);
                int q = perNums.get(j - 1);
                int n = p + q;
                nums.add(n);
            }
            if(i != 0){
                nums.add(1);
            }
            list.add(nums);
        }
        return list;
    }
    private static void printPascalsTriangle(Solution s, int n) {
        System.out.println(s.generate(n));
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        printPascalsTriangle(solution, 10);
    }


}

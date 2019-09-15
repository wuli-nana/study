import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class quset4 {

    public List<String> commonCharctrer(String[] A){
       List<Map<Character,Integer>> count = new ArrayList<>();
        for(String  a : A){
            Map<Character,Integer> map = new HashMap<>();
            for(char c: a.toCharArray()){
                int n = map.getOrDefault(c,0);
                count.add(map);
            }

        }
        boolean allContain = true;
        for(int i = 1;i < count.size();i++){
            Map<String,Integer> map = count.get(i);
        }

        System.out.println(count);
        return null;
    }

    public static  List<String> commonCharcter2(String [] A){
        List<int[]> counts = new ArrayList<>();
        for(String s : A){
            int [] a = new int[26];

        }

    }
    public static void main(String[] args) {
        System.out.println();
    }
}

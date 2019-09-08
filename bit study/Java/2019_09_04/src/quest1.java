import java.util.HashMap;
import java.util.Map;

public class quest1 {
    public static Map<Integer,Integer> count (int[] number){
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : number){
            int c = map.getOrDefault(n,0);
            map.put(n,c+1);
        }
        return map;
    }

    public static void main(String[] args) {
        int[] number = {3,1,4,6,5,3,6,8,9,4,0}

        Map<Integer,Integer> map = count(number);
    }

}

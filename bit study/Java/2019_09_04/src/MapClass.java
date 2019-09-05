import java.util.Map;

public class MapClass {
    class Solution {
        public int singleNumber(int[] nums) {
            Map<Integer,Integer> count(int[] numbers){
                Map<Integer,Integer> map = new HashMap<>();
                // key: 数字
                //value： 该数组出现的次数
                for(int n : numbers){
                    int c = map.getOrDefault(n,0);
                    map.put(n,c+1);
                }
                //遍历取出所有的key
                //keySet();
                //遍历取出所有的value
                //values();
                //所有的数字及其value
                entrySet();
                for(Map.Entry<Integer,Intrger> entry: map.entrySet()){
                    int number = entry.getKey();
                    int cut = entry.getKey();
                    if(cur == 1){
                        System.out.println(number);
                    }
                }

            }
        }
    }
    //
    /*
    *
    * class Solution {
    public int numJewelsInStones(String J, String S) {
        Set<String> set = new HashSet<>() ;
        for(char ch : J.tocharArray()){
            set.add(ch);
        }
        int count = 0;
        for(char ch: S toCharArray){
            if(set.contains(ch)){
                count ++;
            }
        }
        return count;

    }
}*/
    public static void main(String[] args) {



    }
}

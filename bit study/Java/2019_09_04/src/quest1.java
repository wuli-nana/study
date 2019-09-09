import java.util.HashMap;
import java.util.Map;

/**
 * 只出现一次的数字
 */
public class quest1 {
    /**
     * 将数组中的数与出现的次数统计
     * @param number 所需要查询的数组
     * @return Map返回
     */
    public static Map<Integer,Integer> count (int[] number){
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : number){
            //V getOrDefault(Object key, V defaultValue)
            // 返回 key 对应的 value，key 不存在，返回默认值
            int c = map.getOrDefault(n,0);
            //V put(K key, V value) 设置 key 对应的 value
            map.put(n,c+1);
        }
        return map;
    }

    public static void main(String[] args) {
        int[] numbers = {3,1,4,6,5,3,6,8,9,4,0};
        Map<Integer,Integer> map = count(numbers);
        System.out.println(map);
        //遍历Map,将出现次数为一次的统计出来
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int number = entry.getKey();
            int cnt = entry.getValue();
            if (cnt == 1) {
                System.out.println(number);
            }
        }
    }

}

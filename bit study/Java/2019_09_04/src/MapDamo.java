import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class MapDamo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"hello");
        map.get(1);
        map.put(2,"java");
        map.put(3,"bite");
        System.out.println(map);
        System.out.println(map.get(2));
        //打印所有的key
        for(Integer key : map.keySet()){
            System.out.println(key);
        }
        for(String s:map.values()){
            System.out.println(s);
        }
        for(Map.Entry<Integer,String> e :map.entrySet() ){
            System.out.println(e.getKey() + "==>" +e.getValue());
        }
        map.clear();
        System.out.println(map);

    }
}

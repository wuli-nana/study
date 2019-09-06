import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("Java");
        set.add("bit");
        set.add("bye");
        System.out.println(set);
        Iterator<String> it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

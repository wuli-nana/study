import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class quest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expected = sc.nextLine();
        String actual = sc.nextLine();
        Set<Character> set = new HashSet<>();

        //public String toUpperCase();String 类将字母统一大写的方法
        //public char[] toCharArray();String 类将字符串转化为新的字符数组
        char[] a = actual.toUpperCase().toCharArray();
        // 不区分大小写，统一把字符串转为大写，并存放在新的数组里
        for (char c : a) {
            set.add(c);
        }

        char[] b = expected.toUpperCase().toCharArray();
        // 记录已经打印过的键
        // 找出坏的键
        Set<Character> brokenKeys = new HashSet<>();
        for (char c : b) {
            //Set contains(Object o)
            //如果此集合包含指定的元素，则返回 true
            if (!set.contains(c)) {
                // c 对应的键是坏的
                if (!brokenKeys.contains(c)) {
                    System.out.print(c);
                    brokenKeys.add(c);
                }
            }
        }

    }
}

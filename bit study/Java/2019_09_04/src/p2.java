import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p2 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> map = new HashMap<>();
        for(String cp: cpdomains){
            String[] t = cp.split(" ");
            int n = Integer.valueOf(t[0]);
            System.out.println(n);
            String domain = t[1];

            String[] u = domain.split("\\.");
            for(int i = 0;i < u.length; i++){
                String[] sub = Arrays.copyOfRange(u,i,u.length);
                String d = String.join(".",sub);
            }
        }


        return null;

    }

}

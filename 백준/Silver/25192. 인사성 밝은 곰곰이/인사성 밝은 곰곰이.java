import java.io.LineNumberInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Set<String> set = new HashSet<>();
        int count=0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if(s.equals("ENTER")){
                set.clear();
            }
            else{
                if(!set.contains(s)){
                    set.add(s);
                    count++;
                }
            }

        }
        System.out.println(count);


    }
}
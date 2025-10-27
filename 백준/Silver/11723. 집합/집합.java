import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Set<Integer> set = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();

            if (name.equals("add")) {
                set.add(Integer.parseInt(st.nextToken()));
            } 
            else if (name.equals("remove")) {
                set.remove(Integer.parseInt(st.nextToken()));
            } 
            else if (name.equals("check")) {
                int value = Integer.parseInt(st.nextToken());
                sb.append(set.contains(value) ? 1 : 0).append('\n');
            } 
            else if (name.equals("toggle")) {
                int value = Integer.parseInt(st.nextToken());
                if (set.contains(value)) {
                    set.remove(value);
                } else {
                    set.add(value);
                }
            } 
            else if (name.equals("all")) {
                for (int j = 1; j <= 20; j++) {
                    set.add(j);
                }
            } 
            else if (name.equals("empty")) {
                set.clear();
            }
        }

        System.out.print(sb);
    }
}

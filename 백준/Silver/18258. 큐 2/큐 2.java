import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            String s = br.readLine();

            if(s.startsWith("push")) {
                int x = Integer.parseInt(s.split(" ")[1]);
                q.add(x);
            }
            else if(s.equals("pop")) {
                bw.write((q.isEmpty() ? -1 : q.poll()) + "\n");
            }
            else if(s.equals("size")) {
                bw.write(q.size() + "\n");
            }
            else if(s.equals("empty")) {
                bw.write((q.isEmpty() ? 1 : 0) + "\n");
            }
            else if(s.equals("front")) {
                bw.write((q.isEmpty() ? -1 : q.getFirst()) + "\n");
            }
            else if(s.equals("back")) {
                bw.write((q.isEmpty() ? -1 : q.getLast()) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}

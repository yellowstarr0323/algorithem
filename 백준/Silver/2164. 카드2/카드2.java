import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());
    Queue<Integer> list = new LinkedList<>();
    for (int i = 1; i <= n; i++) {
      list.add(i);
    }

    while(list.size() >1) {
      list.poll();
      list.add(list.poll());
    }

    bw.write(String.valueOf(list.peek()));
    bw.flush();
    bw.close();


    }
}
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    int n = Integer.parseInt(br.readLine());
    for(int i = 0; i < n; i++) {
      int input = Integer.parseInt(br.readLine());
      input -=input*2;
      if(input == 0) {
        if(pq.isEmpty()) {
          System.out.println(0);
        }
        else {
          System.out.println(-1*pq.poll());
        }
      }
      else {
        pq.add(input);
      }
    }


  }
}
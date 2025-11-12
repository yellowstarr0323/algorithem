import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    Deque<Integer> q = new ArrayDeque<>();
    List<Integer> list = new ArrayList<>();
    int n = sc.nextInt();
    int k = sc.nextInt();

    for(int i = 1; i <= n; i++) {
      q.add(i);
    }
    for(int i = 0; i < n; i++ ) {
      for(int j=0; j < k-1; j++) {
        int temp = q.getFirst();
        q.removeFirst();
        q.addLast(temp);
      }

      list.add(q.getFirst());
      q.removeFirst();
    }
    System.out.print("<");
    for(int i = 0; i < n; i++) {
      if(i==n-1) {
        System.out.print(list.get(i));
      }
      else{
        System.out.print(list.get(i) + ", ");
      }

    }
    System.out.print(">");

  }
}
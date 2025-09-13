import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int count = 0;
    Set<String> set1 = new HashSet<>();

    for (int i = 0; i < n; i++) {
      set1.add(sc.next());
    }

    for (int i = 0; i < m; i++) {
      if(set1.contains(sc.next())) {
        count++;
      }
    }
    System.out.println(count);

  }
}
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();

    for(int i=0; i<n; i++) {
      set1.add(sc.nextInt());
    }
    for(int i=0; i<m; i++) {
      set2.add(sc.nextInt());
    }
    int count = 0;
    Set<Integer> realSet1 = new HashSet<>(set1);
    set1.removeAll(set2);
    count += set1.size();
    set2.removeAll(realSet1);
    count += set2.size();
    System.out.println(count);
  }
}
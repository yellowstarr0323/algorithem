import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Set<String> set = new HashSet<>();
    for (int i = 0; i < n; i++) {
      String key = sc.next();
      String value = sc.next();
      if(value.equals("enter")) {
        set.add(key);
      }
      else {
        set.remove(key);
      }
    }
    set.stream()
        .sorted(Comparator.reverseOrder())
        .forEach(System.out::println);

  }

}

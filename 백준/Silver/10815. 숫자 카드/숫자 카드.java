import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Set<Integer> set = new HashSet<>();
    for(int i = 0; i < n; i++){
      set.add(sc.nextInt());
    }
    n=sc.nextInt();
    for(int i = 0; i < n; i++){
      int input=sc.nextInt();
      if(set.contains(input)){
        System.out.print("1 ");
      }
      else{
        System.out.print("0 ");
      }
    }
  }
}
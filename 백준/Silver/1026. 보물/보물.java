import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    List<Integer> a = new ArrayList<>();
    List<Integer> b = new ArrayList<>();

    for(int i = 0; i < n; i++){
      a.add(sc.nextInt());
    }
    for(int i = 0; i < n; i++){
      b.add(sc.nextInt());
    }
    Collections.sort(a);
    Collections.sort(b,Collections.reverseOrder());

    int sum=0;
    for(int i = 0; i < n; i++){
      sum+=a.get(i)*b.get(i);
    }
    System.out.println(sum);
  }
}
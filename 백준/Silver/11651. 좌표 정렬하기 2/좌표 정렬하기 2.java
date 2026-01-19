import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);


    int n = sc.nextInt();
    List<List<Integer>> list = new ArrayList<>();

    for(int i = 0; i < n; i++){
      List<Integer> temp = new ArrayList<>();
      temp.add(sc.nextInt());
      temp.add(sc.nextInt());
      list.add(temp);
    }
    List<List<Integer>> answer= list.stream().sorted(Comparator.comparingInt((List<Integer>y)->y.get(1))
        .thenComparing(y->y.get(0))).collect(Collectors.toList());

    for(List<Integer> x : answer){
      System.out.println(x.get(0)+" "+x.get(1));
    }


  }
}
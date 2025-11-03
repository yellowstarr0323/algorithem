import java.util.*;
import java.util.regex.PatternSyntaxException;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<Integer,String> map = new HashMap();
    List<String> list = new ArrayList();

    int n = sc.nextInt();
    for(int i = 0; i < n; i++){
      int m = sc.nextInt();
      int[] array = new int[m];
      for(int j = 0; j < m; j++){
       int money = sc.nextInt();
       String name = sc.next();
       map.put(money,name);
        array[j] = money;
      }
      int max = 0;
      for(int j = 0; j < m; j++){
        if(max<array[j]){
          max = array[j];
        }
      }
      list.add(map.get(max));
    }
    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }



  }
}
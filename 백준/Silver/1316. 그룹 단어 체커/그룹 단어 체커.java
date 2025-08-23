import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result=0;
    for(int i=0;i<n;i++){
      String string = sc.next();
      boolean flag = true;
      Set<Character> set = new HashSet<>();

      char before=string.charAt(0);
      set.add(before);
      for(int j=1;j<string.length();j++) {//aca    a
        char now = string.charAt(j);
        if(now!=before){
          if(set.contains(now)){
            flag = false;
            break;
          }
          set.add(now);
        }
        before=now;

      }
      if(flag){
        result++;
      }

    }
    System.out.println(result);

  }
}
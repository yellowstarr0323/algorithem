import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < n; i++) {
      String s = sc.nextLine();
      Stack<String> stack = new Stack<String>();
      boolean flag = true;
      for (int j = 0; j < s.length(); j++) {
        char c = s.charAt(j);
        if (c == '(') {
          stack.push("(");
        }
        else if (c == ')') {
          if (stack.isEmpty()) {
            stack.push(")");
            flag = false;
          }
          stack.pop();
        }

      }
      if (flag&&stack.isEmpty()) {
        System.out.println("YES");
      }
      else {
        System.out.println("NO");
      }


    }

  }
}
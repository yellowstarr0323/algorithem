import java.util.Collection;
import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();

    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      String s = sc.next();


      if(s.equals("push")){
        int item = sc.nextInt();
        stack.push(item);
      }
      else if(s.equals("pop")){
        if(stack.isEmpty()){
          System.out.println("-1");
        }
        else{
          System.out.println(stack.pop());
        }

      }

      else if(s.equals("size")){
        System.out.println(stack.size());
      }
      else if(s.equals("empty")){

        System.out.println(stack.isEmpty()?"1":"0");
      }
      else if(s.equals("top")){
        if(stack.isEmpty()){
          System.out.println("-1");
        }
        else{
          System.out.println(stack.peek());
        }
      }

    }


  }
}
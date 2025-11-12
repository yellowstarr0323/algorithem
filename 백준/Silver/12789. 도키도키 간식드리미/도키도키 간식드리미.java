import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Deque<Integer> currentLine = new ArrayDeque<>();
    Deque<Integer> tempLine = new ArrayDeque<>();

    int n = sc.nextInt();
    for(int i = 0; i < n; i++) {
      currentLine.addLast(sc.nextInt());
    }
    for (int i = 1; i <=n; i++) {
      for(int j = 0; j < n; j++) {
        if(!currentLine.isEmpty()&&currentLine.getFirst()==i) {
          currentLine.pop();
       
          break;
        }
        else if(!tempLine.isEmpty()&&tempLine.getFirst()==i) {
          tempLine.pop();
          break;
        }
        else{
          if(!currentLine.isEmpty()) {
            tempLine.push(currentLine.getFirst());
            currentLine.pop();
          }
          
          
        }
      }
    }

    if(currentLine.isEmpty()&&tempLine.isEmpty()) {
      System.out.println("Nice");
    }
    else {
      System.out.println("Sad");
    }


  }
}
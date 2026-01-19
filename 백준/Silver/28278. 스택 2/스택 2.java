import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main{
  public static void main(String[] args)throws Exception{
    Scanner sc = new Scanner(System.in);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Deque<Integer> stack = new ArrayDeque<>();

    int n = sc.nextInt();
    for(int i = 0; i < n; i++){
      char ch= sc.next().charAt(0);
      switch(ch){
        case'1':
          stack.push(sc.nextInt());
          break;
          case '2':
            if(!stack.isEmpty()){
              bw.write(String.valueOf(stack.pollFirst()));
            }
            else{
              bw.write("-1");
            }
            bw.newLine();
            break;

        case '3':
              bw.write(String.valueOf(stack.size()));
          bw.newLine();

          break;
              case '4':
                if(stack.isEmpty()){
                  bw.write("1");
                }
                else{
                  bw.write("0");

                }
                bw.newLine();

                break;
                case '5':
                  if(!stack.isEmpty()){
                    bw.write(String.valueOf(stack.peekFirst()));
                  }
                  else{
                    bw.write("-1");
                  }
                  bw.newLine();

                  break;


      }
    }
    bw.flush();
    bw.close();

  }
}
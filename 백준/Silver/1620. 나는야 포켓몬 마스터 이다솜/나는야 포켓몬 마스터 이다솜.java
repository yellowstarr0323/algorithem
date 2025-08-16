import javax.print.DocFlavor;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TooManyListenersException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] input= br.readLine().split(" ");
    int n = Integer.parseInt(input[0]);
    int m = Integer.parseInt(input[1]);

    Map<String,Integer> nameToNum = new HashMap<>();
    Map<Integer,String> numToName = new HashMap<>();

    for(int i=1;i<=n;i++){
      String temp = br.readLine();
      nameToNum.put(temp,i);
      numToName.put(i,temp);

    }

    for(int i=0;i<m;i++){
      String problem = br.readLine();
      //숫자 -> 문자열
      if(problem.charAt(0)>='0' && problem.charAt(0)<='9'){
        bw.write(numToName.get(Integer.parseInt(problem)));
        bw.newLine();
      }
      //문자열 -> 숫자
      else{
        bw.write(Integer.toString(nameToNum.get(problem)));
        bw.newLine();
      }
    }
    bw.flush();
    bw.close();
  }
}
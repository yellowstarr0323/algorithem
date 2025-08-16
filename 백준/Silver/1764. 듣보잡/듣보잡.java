import javax.print.DocFlavor;
import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] input=br.readLine().split(" ");
    int a=Integer.parseInt(input[0]);
    int b=Integer.parseInt(input[1]);

    Set<String> set=new HashSet<>();


    for (int i = 0; i < a; i++) {
      set.add(br.readLine());
    }

    List<String> list=new ArrayList<>();
    for(int i=0;i<b;i++){
      String name=br.readLine();
      if(set.contains(name)){
        list.add(name);
      }
    }
    Collections.sort(list);
    bw.write(list.size()+"\n");
    for(int i=0;i<list.size();i++){
      bw.write(list.get(i));
      bw.newLine();
    }
    bw.flush();
    bw.close();


  }
}
import java.io.*;
import java.util.Arrays;

public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    for(int i = 0; i < n; i++){
      int[] arr = new int[10];
      String[] strings = br.readLine().split(" ");
      for(int j = 0; j < strings.length; j++){
        arr[j] = Integer.parseInt(strings[j]);
      }
      Arrays.sort(arr);
      bw.write(arr[7]+"\n");
    }
    bw.flush();
    bw.close();
  }
}
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n=Integer.parseInt(br.readLine());
    for(int i=0;i<n;i++){
      String[] input = br.readLine().split(" ");
      int a=Integer.parseInt(input[0]);
      int b=Integer.parseInt(input[1]);
      bw.write(String.valueOf(a+b));
      bw.newLine();
    }

    bw.flush();
    bw.close();

  }
}
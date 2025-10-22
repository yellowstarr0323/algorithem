import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Main{
  public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(BigInteger.TWO.pow(n).subtract(BigInteger.ONE));
    if(n<=20){
      hanoi(n,1,2,3);
    }
    bw.flush();
    bw.close();

  }
  public static void hanoi(int n, int start, int mid, int end) throws IOException {
    if(n == 0){
      return;
    }
    hanoi(n-1, start, end, mid);
    bw.write(start+" "+end+"\n");
    hanoi(n-1, mid, start, end);


  }
}
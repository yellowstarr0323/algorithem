import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    
    //첫번째 식
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    // 두번째 식
    int d = sc.nextInt();
    int e = sc.nextInt();
    int f = sc.nextInt();

    //각각의 x, y가 -999 <= x, y <= 999이기 때문에
    for(int i = -999; i <= 999; i++) {
      for(int j = -999; j <= 999; j++) {
        if(a*i + b*j  == c){ // ax + by 가 C이고(x = i, y = j)
          if(d*i + e*j  == f) { // dx + ey가 f일 때(x = i, y = j)
            System.out.println(i+" "+j);
            break;
          }
        }
      }
    }
    

  }
}
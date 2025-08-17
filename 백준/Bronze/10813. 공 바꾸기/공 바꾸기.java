import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      list.add(i);
    }
    for (int i = 1; i <=m; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      Collections.swap(list, a-1, b-1);
    }
    for(int i=0; i<n;i++){
      System.out.print(list.get(i)+" ");
    }

  }
}
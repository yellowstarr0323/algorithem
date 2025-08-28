import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    int[] arr = new int[4];
    int temp;
    for(int i = 0; i < t; i++){
      int c = sc.nextInt();
      arr[0]=c/25;
      c=c%25;
      arr[1]=c/10;
      c=c%10;
      arr[2]=c/5;
      c=c%5;
      arr[3]=c/1;
      for(int j = 0; j < arr.length; j++){
        System.out.print(arr[j]+" ");
      }
      System.out.println();



    }
  }
}
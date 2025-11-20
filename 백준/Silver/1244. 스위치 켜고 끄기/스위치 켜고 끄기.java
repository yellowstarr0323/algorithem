import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int studentNum = sc.nextInt();
    for(int i = 0; i < studentNum; i++) {
      int gender = sc.nextInt();
      int sw = sc.nextInt();
      if(gender == 1) {
        for(int j = 1; j <= n; j++) {
          if(j % sw == 0) {
            arr[j-1] = arr[j-1] == 0 ? 1 : 0;
          }
        }
      }
      else if(gender == 2) {
        int left = sw-1;
        int right = sw-1;
       while(left-1>=0&&right+1<n && arr[left-1]==arr[right+1]) {
         left--;
         right++;
       }
       for(int j = left; j <= right; j++) {
         arr[j] = arr[j] == 0 ? 1 : 0;
       }

      }

    }
    for(int j = 0; j < n; j++) {
      System.out.print(arr[j]+" ");
      if((j+1)%20==0)
        System.out.println();
    }
  }
}
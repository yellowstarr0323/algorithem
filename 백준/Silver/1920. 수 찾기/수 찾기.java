import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) {
      arr1[i] = sc.nextInt();
    }

    int n2=sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) {
      arr2[i] = sc.nextInt();
    }

    Arrays.sort(arr1);

    for(int i=0;i<n2;i++){
      int left=0;
      int right=arr1.length-1;
      boolean found=false;

      while(left<=right){
        int m=(left+right)/2;

        if(arr1[m]==arr2[i]){
          System.out.println("1");
          found=true;
          break;
        }

        else if(arr1[m]>arr2[i]){
          right=m-1;
        }

        else if(arr1[m]<arr2[i]){
          left=m+1;
        }

      }
      if(!found){
        System.out.println("0");
      }
    }
  }
}
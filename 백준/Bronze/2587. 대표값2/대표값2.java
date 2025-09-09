import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[5];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    int sum = 0;
    int mid = arr.length / 2;
    for(int i = 0; i < arr.length; i++){
      sum += arr[i];

    }

    for(int i=0;i<arr.length-1;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]>arr[j]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    
    System.out.println(sum/5);
    System.out.println(arr[2]);
  }
}
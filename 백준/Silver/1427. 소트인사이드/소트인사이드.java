import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char[] arr = sc.next().toCharArray();

    for(int i=0;i<arr.length;i++){
      int max=i;
      for(int j=i;j<arr.length;j++){
        if(arr[j]>=arr[max]){
          max=j;
        }
      }
      char temp = arr[i];
      arr[i] = arr[max];
      arr[max]=temp;
    }
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]);
    };
  }

}
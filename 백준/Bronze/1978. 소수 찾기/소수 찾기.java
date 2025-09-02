import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count=0;
    for (int i = 0; i < n; i++) {
      int num=sc.nextInt();
      if(num==2 || num==3){
        count++;
        continue;
      }
      for(int j=2;j<num;j++){
        if(j==num-1)
          count++;
        if(num%j==0){
          break;
        }
      }

    }
    System.out.println(count);
  }
}
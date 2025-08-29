import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int sum = 0;
    int count=3;
    int temp=2;
    for(int i=0;i<n;i++){
      sum=(int)Math.pow(count,2);
      count+=temp;
      temp*=2;
    }
    System.out.println(sum);
  }
}
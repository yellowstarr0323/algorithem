import java.util.Scanner;
import java.util.function.DoublePredicate;

public class Main{
  static int count=0;
  public static int fibonacci(int n){
    if(n==1 || n==2){
      count++;
      return 1;
    }
    return fibonacci(n-1) + fibonacci(n-2);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    fibonacci(n);
    System.out.print(count);
    System.out.print(" "+(n-2));
  }
}
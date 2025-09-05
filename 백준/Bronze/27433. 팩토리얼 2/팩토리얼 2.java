import java.util.Scanner;

public class Main {

  public static Long factorial(Long n) {

    if(n == 0) return Long.valueOf(1);

    return factorial(n-1)*n;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Long n = sc.nextLong();

    System.out.println(factorial(n));
  }
}
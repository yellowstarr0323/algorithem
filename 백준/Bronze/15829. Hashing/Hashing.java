import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String b = sc.next();
    long sum = 0;
    for(int i = 0; i <a; i++) {
      char c= b.charAt(i);
      sum+=(c-'a'+1)*Math.pow(31,i);
    }
    System.out.println(sum);
  }
}
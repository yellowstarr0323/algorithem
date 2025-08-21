import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    s=s.replaceAll("c=", "0");
    s=s.replaceAll("c-", "0");
    s=s.replaceAll("dz=", "0");
    s=s.replaceAll("d-", "0");
    s=s.replaceAll("lj", "0");
    s=s.replaceAll("nj", "0");
    s=s.replaceAll("s=", "0");
    s=s.replaceAll("z=", "0");

    System.out.println(s.length());


  }
}
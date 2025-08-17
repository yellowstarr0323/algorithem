import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int total = sc.nextInt();
    int n = sc.nextInt();
    for(int i=0; i<n; i++){
      int money = sc.nextInt();
      int count = sc.nextInt();
      total-=money*count;
    }
    if(total==0){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
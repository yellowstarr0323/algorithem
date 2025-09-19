import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n=sc.nextInt();
    int count=0;
    int add=1;
    while(n>add){
      add+=6*count;
      count++;
    }
    if(n==1){
      System.out.println(1);
    }
    else{
      System.out.println(count);
    }




}
}
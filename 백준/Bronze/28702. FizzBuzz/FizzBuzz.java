import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int num = 0;

    boolean flag = false;

    for(int i=0; i<3; i++) {
      String str = sc.nextLine();
      char c = str.charAt(0);

      if(c<='9'&&c>='0') {
        num = Integer.parseInt(str);
        flag = true;
      }

      if(flag) {
        num++;
      }
    }

    if(num%3==0) {
      if(num%5==0) {
        System.out.println("FizzBuzz");
      }
      else {
        System.out.println("Fizz");
      }
    }
    else{
      if(num%5==0) {
        System.out.println("Buzz");
      }
      else {
        System.out.println(num);
      }
    }
  }
}
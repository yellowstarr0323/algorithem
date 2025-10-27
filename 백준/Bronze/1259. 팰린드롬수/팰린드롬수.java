import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    while(true){
      boolean flag = true;
      String s = sc.nextLine();
      if(s.equals("0"))
        break;
      for(int i = 0; i < s.length()/2; i++){
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
          flag = false;
          break;

        }
      }
      if(flag){
        System.out.println("yes");
      }
      else{
        System.out.println("no");
      }
    }

  }
}
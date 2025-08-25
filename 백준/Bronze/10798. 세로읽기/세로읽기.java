import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<String> list = new ArrayList<String>();
    for(int i = 0; i <5; i++) {
      list.add(sc.nextLine());
    }

    int maxLength=0;
    for(String s : list) {
      maxLength = Math.max(maxLength, s.length());
    }

    for(int i = 0; i <maxLength; i++) {
      for(int j=0; j<5;j++){
        if(i<list.get(j).length()) {
          System.out.print(list.get(j).charAt(i));
        }
      }
    }
  }
}
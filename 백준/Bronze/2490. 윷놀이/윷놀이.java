import com.sun.security.auth.NTDomainPrincipal;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for(int i=0;i<3;i++){
      int arr[]=new int[4];
      for(int j=0;j<4;j++){
        arr[j]=sc.nextInt();
      }
      switch (arr[0]+arr[1]+arr[2]+arr[3]){
        case 0:
          System.out.println("D");
          break;
          case 1:
            System.out.println("C");
            break;
            case 2:
              System.out.println("B");
              break;
              case 3:
                System.out.println("A");
                break;
                case 4:
                  System.out.println("E");
                  break;
      }

    }



  }
}
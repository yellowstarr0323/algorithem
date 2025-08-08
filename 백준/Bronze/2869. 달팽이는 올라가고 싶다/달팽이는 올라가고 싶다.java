import javax.security.auth.login.AccountException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();//5
        int b=sc.nextInt();//1
        int v=sc.nextInt();//6
        int days= (v-a)/(a-b);
        if((v-a)%(a-b)!=0) {
            days++;
        }

        days++;
        System.out.println(days);








    }
}

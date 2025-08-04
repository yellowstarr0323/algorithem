import javax.security.auth.login.AccountException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int people=0;

            int floor=sc.nextInt();//2
            int number=sc.nextInt();//3

            int[][] dp= new int[floor+1][15];

            for(int j=1;j<15;j++){
                dp[0][j]=j;
            }

            //a-1층의 1호부터 n호까지

            for(int a=1; a<=floor; a++) {//a==2
                for (int j = 1; j <= number; j++) {
                    for (int k = 1; k <= j; k++) {
                        dp[a][j]+=dp[a-1][k];
                    }
                }

            }
            System.out.println(dp[floor][number]);

        }






    }
}

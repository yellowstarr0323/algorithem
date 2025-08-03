import javax.security.auth.login.AccountException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] alpha=new int[26];
        String str=sc.nextLine();
        str=str.toUpperCase();

        for(int i=0;i< str.length();i++){
            int n = str.charAt(i)-'A';
            alpha[n]++;
        }



        int maxIndex=0;
        int max=0;


        for(int i=0;i<alpha.length;i++){
            if(max<alpha[i]){
                max=alpha[i];
                maxIndex=i;


            }
        }
        int maxCount=0;
        for(int i=0;i<alpha.length;i++){
            if(max==alpha[i]){
                maxCount++;
            }
        }
        if(maxCount>=2){
            System.out.println("?");
        }
        else {
            System.out.println((char)(maxIndex+'A'));
        }


    }
}

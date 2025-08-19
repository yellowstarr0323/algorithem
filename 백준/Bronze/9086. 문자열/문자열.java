import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            String s = input.next();
            System.out.print(s.charAt(0));
            System.out.println(s.charAt(s.length()-1));
            

        }
    }
}

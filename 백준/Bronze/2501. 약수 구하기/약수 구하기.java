import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // i가 n의 약수라면
                count++;
                if (count == k) { // k번째 약수면 출력하고 종료
                    System.out.println(i);
                    return;
                }
            }
        }

        // k번째 약수가 없으면 0 출력
        System.out.println(0);
    }
}

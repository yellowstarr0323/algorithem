import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);

        long gcd = gcd(a, b);
        long lcm = (a * b) / gcd; // 최소공배수 공식

        bw.write(lcm + "\n");
        bw.flush();
    }

    // 최대공약수 (유클리드 호제법)
    private static long gcd(long x, long y) {
        while (y != 0) {
            long temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }
}

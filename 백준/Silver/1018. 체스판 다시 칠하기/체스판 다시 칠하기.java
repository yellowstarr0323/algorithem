import javax.xml.transform.Source;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] input = br.readLine().split(" ");
    int M = Integer.parseInt(input[0]);
    int N = Integer.parseInt(input[1]);

    char[][] board = new char[M][N];

    for (int i = 0; i < M; i++) {
      String line = br.readLine();
      board[i] = line.toCharArray();
    }

    int answer=64;
    for(int i = 0; i <= M-8; i++) {
      for (int j = 0; j <= N - 8; j++) {

        int countW = 0;
        int countB = 0;
        for (int k = i; k < i + 8; k++) {
          for (int l = j; l < j + 8; l++) {
            if ((k + l) % 2 == 0) {
              if (board[k][l] != 'W')
                countW++;
              if (board[k][l] != 'B')
                countB++;
            } else {
              if (board[k][l] != 'B') countW++;
              if (board[k][l] != 'W') countB++;
            }
          }
        }
        answer = Math.min(answer, Math.min(countW, countB));
      }
    }
    System.out.println(answer);

  }
}
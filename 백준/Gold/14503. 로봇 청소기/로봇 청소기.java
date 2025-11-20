import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] arr = new int[n][m];

    int x = sc.nextInt();
    int y = sc.nextInt();
    int direction = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    arr[x][y] = 2;
    int[] dx={-1,0,1,0};
    int[] dy={0,1,0,-1};
    while(true){


      boolean move = false;

      for (int i = 0; i < 4; i++) {
        direction = (direction +3)%4;
        int nx = x + dx[direction];
        int ny = y + dy[direction];

        if(nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 0){
          x=nx;
          y=ny;
          move = true;
          arr[nx][ny] = 2;
          break;
        }
      }
      if(!move){
        int back = (direction+2)%4;
        int bx = x + dx[back];
        int by = y + dy[back];

        if(bx>=0 && bx<n && by>=0 && by<m && arr[bx][by] !=1){
          x=bx;
          y=by;
        }
        else {
          break;
        }
      }

    }
    int count=0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if(arr[i][j] == 2){
          count++;
        }
      }
    }
    System.out.println(count);
  }

}
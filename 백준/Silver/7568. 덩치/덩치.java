import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(br.readLine());
    int [][]  weightHeight=new int[n][2];
    int[] score=new int[n];
    for(int i=0;i<n;i++){
      score[i]=1;
    }

    for(int i = 0; i < n; i++){
      String[] s = br.readLine().split(" ");
      int weight = Integer.parseInt(s[0]);
      int height = Integer.parseInt(s[1]);
      weightHeight[i][0] = weight;
      weightHeight[i][1] = height;
    }

    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
        if(weightHeight[i][0]<weightHeight[j][0]&&weightHeight[i][1]<weightHeight[j][1]){
          score[i]++;
        }
      }
    }
    for(int i = 0; i < n; i++){
      System.out.print(score[i]+" ");
    }

  }
}
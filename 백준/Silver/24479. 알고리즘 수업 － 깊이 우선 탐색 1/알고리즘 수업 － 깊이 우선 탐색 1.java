import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {

  static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
  static int[] visited;
  static int count = 0;
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] s = br.readLine().split(" ");
    int n = Integer.parseInt(s[0]);
    int m = Integer.parseInt(s[1]);
    int r = Integer.parseInt(s[2]);

    visited= new int[n+1];

    for(int i = 0;i<n+1;i++){
      graph.add(new ArrayList<>());
    }

    for (int i = 0; i < m; i++) {
      String[] ss = br.readLine().split(" ");
      int u = Integer.parseInt(ss[0]);
      int v = Integer.parseInt(ss[1]);
      graph.get(u).add(v);
      graph.get(v).add(u);
    }

    for(int i=1; i<graph.size(); i++)
      Collections.sort(graph.get(i));

    dfs(r);

    for(int i = 1;i<n+1;i++){
      bw.write(visited[i]+"\n");
    }
    bw.flush();
    bw.close();
  }
  public static void dfs(int r){
    visited[r] = ++count;
    for(int i:graph.get(r)){
      if(visited[i]==0) dfs(i);
    }

  }
}
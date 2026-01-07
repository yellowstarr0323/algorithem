import javax.naming.InterruptedNamingException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {

  static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
  static boolean[] visited;
  static int count = 1;
  static int[] result;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] s = br.readLine().split(" ");
    int n = Integer.parseInt(s[0]);
    int m = Integer.parseInt(s[1]);
    int r = Integer.parseInt(s[2]);

    visited= new boolean[n+1];
    result= new int[n+1];

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

    bfs(r);

    for(int i = 1;i<n+1;i++){
      bw.write(result[i]+"\n");
    }
    bw.flush();
    bw.close();
  }
  public static void bfs(int start){
    Queue<Integer> q = new LinkedList<>();
    q.offer(start);

    while(!q.isEmpty()){
      int current = q.poll();

      if(visited[current]){
        continue;
      }
      visited[current] = true;
      result[current]=count++;
      ArrayList<Integer> list = graph.get(current);
      for(int i = 0;i<list.size();i++){
        int next = list.get(i);
        if(!visited[next]){
          q.offer(next);
        }
      }
    }
  }
}
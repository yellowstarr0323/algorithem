import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class Main {

  static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
  static boolean[] visited;
  static int count = 1;
  static int[] order;

  static boolean[] visited2;
  static int count2 = 1;
  static int[] order2;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] s = br.readLine().split(" ");
    int n = Integer.parseInt(s[0]);
    int m = Integer.parseInt(s[1]);
    int r = Integer.parseInt(s[2]);

    visited= new boolean[n+1];
    order= new int[n+1];

    visited2= new boolean[n+1];
    order2= new int[n+1];

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

    bfs(r);

    for(int i = 1;i<order2.length;i++){
      if(order2[i]==0)
        continue;
      bw.write(order2[i]+" ");
    }
    bw.newLine();

    for(int i = 1;i<order.length;i++){
      if(order[i]==0)
        continue;
      bw.write(order[i]+" ");
    }


    bw.flush();
    bw.close();
  }
  public static void bfs(int start){
    Queue<Integer> q = new LinkedList<>();
    q.offer(start);

    while(!q.isEmpty()) {
      int current = q.poll();

      if (visited[current]) {
        continue;
      }
      visited[current] = true;
      order[count++] = current;
      ArrayList<Integer> list = graph.get(current);
      for (int i=0;i<list.size();i++) {
        int next = list.get(i);
        if (!visited[next]) {
          q.offer(next);
        }
      }
    }
  }

  public static void dfs(int start){
    Stack<Integer> stack = new Stack<>();
    stack.push(start);
    while(!stack.isEmpty()){
      int current = stack.pop();
      if (visited2[current]) {
        continue;
      }
      visited2[current] = true;
      order2[count2++] = current;
      ArrayList<Integer> list = graph.get(current);
      for(int i=list.size()-1; i>=0; i--){
        int next = list.get(i);
        if (!visited2[next]) {
          stack.push(next);
        }
      }

    }
  }
}
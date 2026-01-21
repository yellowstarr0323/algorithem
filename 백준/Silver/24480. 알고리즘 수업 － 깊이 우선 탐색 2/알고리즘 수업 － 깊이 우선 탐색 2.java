
import java.io.*;
import java.util.*;

class Main {
  static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
  static boolean[] visited;
  static int[] result;
  static int count=1;
  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] parts = br.readLine().split(" ");
    int n = Integer.parseInt(parts[0]);
    int m = Integer.parseInt(parts[1]);
    int r = Integer.parseInt(parts[2]);

    visited = new boolean[n+1];
    result = new int[n+1];


    for(int i = 0; i < n+1; i++) {
      graph.add(new ArrayList<>());
    }

    for (int i = 0; i < m; i++) {
      String[] input = br.readLine().split(" ");
      int a = Integer.parseInt(input[0]);
      int b = Integer.parseInt(input[1]);
      graph.get(a).add(b);
      graph.get(b).add(a);
    }

    for(int i =1;i<graph.size();i++) {
      Collections.sort(graph.get(i));
    }

    dfs(r);

    for(int i = 1;i<result.length;i++) {
      bw.write(String.valueOf(result[i]));
      bw.newLine();
    }
    bw.flush();
    bw.close();


  }

  public static void dfs(int r) {
    Stack<Integer> stack = new Stack<>();
    stack.push(r);

    while(!stack.isEmpty()) {
      int current = stack.pop();

      if(visited[current])
        continue;

      visited[current] = true;
      result[current]=count++;

      List<Integer> list = graph.get(current);
      for(int i:list){
        if(!visited[i]){
          stack.push(i);
        }
      }


    }
  }
}
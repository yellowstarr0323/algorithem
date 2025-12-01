import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Map<String, Integer> map = new HashMap<>();

    // 입력
    String[] s = br.readLine().split(" ");
    int n = Integer.parseInt(s[0]);
    int m = Integer.parseInt(s[1]);

    for (int i = 0; i < n; i++) {
      String word = br.readLine();
      if (word.length() >= m) {  
        map.put(word, map.getOrDefault(word, 0) + 1);
      }
    }

    // Map -> List 변환
    List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

    // Comparator 사용하여 3단계 정렬
    list.sort((a, b) -> {
      // 1단계: 빈도수 내림차순
      if (!a.getValue().equals(b.getValue())) {
        return b.getValue() - a.getValue();
      }
      // 2단계: 길이 내림차순
      if (a.getKey().length() != b.getKey().length()) {
        return b.getKey().length() - a.getKey().length();
      }
      // 3단계: 사전순 오름차순
      return a.getKey().compareTo(b.getKey());
    });

    // 출력
    for (Map.Entry<String, Integer> entry : list) {
      bw.write(entry.getKey() + "\n");
    }
    bw.flush();
  }
}

import javax.sound.midi.Soundbank;
import java.io.*;
import java.util.*;


class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<List<Integer>> list = new ArrayList<>();
    int N = Integer.parseInt(br.readLine());

    for(int i = 0; i < N; i++) {
      List<Integer> hang = new ArrayList<>();
      String line = br.readLine();
      String[] tokens = line.split(" ");
      hang.add(Integer.parseInt(tokens[0]));
      hang.add(Integer.parseInt(tokens[1]));
      list.add(hang);
    }
    list.sort(Comparator.comparingInt((List<Integer>o)-> o.get(1))
        .thenComparingInt(o -> o.get(0)));
    int count = 1;
    int currentTime = 0;
    currentTime = list.get(0).get(1);
    for(int j = 1; j < list.size(); j++) {
      if(list.get(j).get(0)>=currentTime) {
        currentTime = list.get(j).get(1);
        count++;
      }


    }

    System.out.println(count);
  }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long n = Long.parseLong(br.readLine());
    Map<Long,Integer> map = new HashMap<>();
    for(int i = 0; i < n; i++){
      long cardNum = Long.parseLong(br.readLine());
      map.put(cardNum, map.getOrDefault(cardNum, 0) + 1);
    }
    int max=-1;
    long num=0;
    for(long k : map.keySet()){
      if(map.get(k)>max){
        max = map.get(k);
        num = k;
      }else if(map.get(k)==max){
        num=Math.min(num,k);
      }
    }
    System.out.println(num);
  }
}
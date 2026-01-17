import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            List<Integer> temp = new ArrayList<>();
            int x = sc.nextInt();
            int y = sc.nextInt();
            temp.add(x);
            temp.add(y);
            list.add(temp);
        }

        list.stream()
                .sorted(Comparator.comparingInt((List<Integer>x) -> x.get(0))
                        .thenComparingInt(x-> x.get(1)))


                .forEach(x -> System.out.println(x.get(0) + " " + x.get(1)));
    }
}
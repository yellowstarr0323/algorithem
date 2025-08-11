import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(input.next());
        }
        List<String> list = new ArrayList<>(set);
        list.sort(
                Comparator.comparingInt(String::length)  // 1단계: 길이순 오름차순
                        .thenComparing(Comparator.naturalOrder())  // 2단계: 길이 같으면 사전순
        );

        for (String s : list) {
            System.out.println(s);
        }
    }
}

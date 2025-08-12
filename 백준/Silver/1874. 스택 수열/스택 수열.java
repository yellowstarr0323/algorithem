import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        List<Character> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int current = 1;
        
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        
        for(int i = 0; i < n; i++) {
            while(current <= arr[i]) {
                stack.push(current++);
                list.add('+');
            }
            if(stack.peek() == arr[i]) {
                stack.pop();
                list.add('-');
            } else {
                System.out.println("NO");
                return;
            }
        }
        for(Character s :list){
            System.out.println(s);
        }
    }
}

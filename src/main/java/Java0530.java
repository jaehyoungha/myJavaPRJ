import java.util.*;
public class Java0530 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < K; i++) {
            int a = sc.nextInt();

            if (a == 0) {
                stack.pop();
            } else {
                stack.push(a);
            }
        }
        sc.close();
        int sum = 0;
        for (Integer a : stack) {
            sum += a;
        }
        System.out.print(sum);
    }
}
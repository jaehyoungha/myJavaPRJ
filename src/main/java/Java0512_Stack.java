import java.util.Scanner;
import java.util.Stack;

public class Java0512_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <n; i++) {
            stack.push(sc.nextInt());
        }
        for (int i = 0; i <n ; i++) {
            System.out.printf("%d ",stack.pop());
        }
    }
}

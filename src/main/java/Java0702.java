import java.util.*;
import java.util.Scanner;
import java.util.Stack;

public class Java0702 {
        public  void main(String[] args) {

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


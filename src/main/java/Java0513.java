import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Java0513 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        stack.push(0); //stack 데이터 추가는 push
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        queue.add(0);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println("stack is LIFO");
        while (!stack.empty()) {
            System.out.println(stack.pop()); //stack 데이터 삭제는 pop *but, 데이터 구현 후 삭제
        }
        System.out.println();

        System.out.println("queue is FIFO");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());//queue 데이터 삭제는 pop *but, 데이터 구현 후 삭제
        }

    }
}
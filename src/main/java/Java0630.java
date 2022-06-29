import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Java0630 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Java0630 j = new Java0630();
        int [] arr = {5, 9, 7, 10};
        int divisor = sc.nextInt();
        j.solution(arr,divisor);
    }
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] % divisor ==0) {
                list.add(arr[i]);
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        int [] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] += list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}

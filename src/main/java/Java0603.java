import java.util.ArrayList;
import java.util.Arrays;

public class Java0603 {
    public static void main(String[] args) {
        Java0603 j = new Java0603();

        int [] numbers = {1,2,3,4,6,7,8,0};
        j.solution(numbers);
    }
    public int solution(int[] numbers) {
        int answer = 45;

        for (int i = 0; i <= numbers.length-1; i++) {
           answer -= numbers[i];
        }

        System.out.println(answer);
        return answer;
    }
}

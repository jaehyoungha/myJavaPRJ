import java.util.Scanner;

public class Java0701 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Java0701 j = new Java0701();
        j.solution(sc.nextInt(),sc.nextInt(),sc.nextInt());
    }
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i =1; i <=count; i++){
            answer += price * i;
        }
        if (answer < money) {
            return 0;
        } else {
            answer -= money;
        }
        System.out.println(answer);
        return answer;
    }
}

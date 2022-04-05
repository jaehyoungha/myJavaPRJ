import java.util.Scanner;

public class Java0610 {
    public static void main(String[] args) {
        Java0610 j = new Java0610();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        j.solution(n);
    }
    public int solution(int n) {
        int answer = 1;
        while (true){
            if (n % answer ==1){
                break;
            }
            answer++;
        }

        System.out.println(answer);
        return answer;
    }
}

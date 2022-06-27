import java.util.Scanner;

public class Java0627 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Java0627 j = new Java0627();
        j.solution(n);
    }
    public String solution(int num) {
        String answer = "";
        if ( num % 2 == 0) {
            answer += "Even";
        }else {
            answer += "Odd";
        }
        System.out.println(answer);
        return answer;
    }
}

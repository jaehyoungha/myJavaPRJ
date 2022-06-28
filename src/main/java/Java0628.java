import java.util.Scanner;

public class Java0628 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Java0628 j = new Java0628();
        int n = sc.nextInt();
        int m = sc.nextInt();

        j.solution(n,m);
    }
    public int[] solution(int n, int m) {
        // 유클리드 호제법
        int a = Math.max(n, m);
        int b = Math.min(n, m);
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        int[] answer = { a, n * m / a };
        return answer;
    }
}

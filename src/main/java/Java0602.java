import java.util.Scanner;

public class Java0602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Java0602 j = new Java0602();
        int [] absolutes = {4,7,12};
        boolean [] signs = {true,false,true};
        j.solution(absolutes,signs);
    }
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i <=absolutes.length-1; i++) {
            if (signs[i] == false) {
                answer += absolutes[i] * -1;
            } else {
                answer += absolutes[i];
            }
        }
        System.out.println(answer);
        return answer;
    }
}

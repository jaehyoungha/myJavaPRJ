import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();

        s.solution(sc.nextInt(), sc.nextInt());
    }

    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <=right; i++) {
            int count =0;
            for(int j=1; j<=i; j++) {

                if(i%j == 0) {
                    count++;
                }
            }
            if(count %2 == 0) {
                answer +=i;
            } else if(count %2 == 1){
                answer -= i;
            }
        }
        System.out.println(answer);

        return answer;
    }
}
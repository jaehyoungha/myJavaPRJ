import java.util.Arrays;
import java.util.Scanner;

public class Java0616 {
    public static void main(String[] args) {
        Java0616 j = new Java0616();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
    }
    public String solution(String s) {
        String answer = "";
        String [] arr = s.split("");
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            answer += arr[i];
        }
        System.out.println();
        return answer;
    }
}
public class Java0606 {
    public static void main(String[] args) {
        Java0606 j = new Java0606();
        String s = "Zbcdefg";
        j.solution(s);
    }
    public String solution(String s) {
        String answer = "";
        String [] arr= s.split("");
        for (int i = arr.length-1; i >=0; i--) {
            answer += arr[i];
        }
        System.out.println(answer);
        return answer;
    }
}

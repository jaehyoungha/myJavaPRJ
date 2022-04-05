public class Java0609 {
    public static void main(String[] args) {
        Java0609 j = new Java0609();

        String s =  "2three45sixseven";

        j.solution(s);
    }
    public int solution(String s) {
        int answer = 0;
        s = s.replace("one","1");
        s = s.replace("two","2");
        s = s.replace("three","3");
        s = s.replace("four","4");
        s = s.replace("five","5");
        s = s.replace("six","6");
        s = s.replace("seven","7");
        s = s.replace("eight","8");
        s = s.replace("nine","9");
        answer += Integer.parseInt(s);
        System.out.println(answer);
        return answer;
    }
}

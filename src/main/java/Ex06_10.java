import java.util.Scanner;

public class Ex06_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hap = 0;
        int num1, num2, num3;
//       시작값이 끝보다 큰 수가 들어오면, "시작값이 끝수보다 큽니다."
//        for문이 실행 안되게.

        System.out.printf(" 시각 값 입력 :");
        num1 = sc.nextInt();

        System.out.printf(" 끝 값 입력 :");
        num2 = sc.nextInt();

        System.out.printf(" 증가 값 입력 :");
        num3 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("시작값이 끝수보다 큽니다.");
        } else {
            for (int i = num1; i <= num2; i = i + num3) {
                hap += i;
            }
            System.out.println(num1 + "부터" + num2 + "까지" + num3 + "씩 증가한 합은 :" + hap);
        }
        }



}

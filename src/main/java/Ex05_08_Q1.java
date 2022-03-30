import java.util.Scanner;

public class Ex05_08_Q1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a;

        a = s.nextInt();
        if ((a % 3 == 0) && (a % 5 == 0)) {
            System.out.printf("3과 5의 배수입니다. \n");
        } else if (a % 3 == 0) {
            System.out.printf("3의 배수입니다 \n");
        } else if (a % 5 == 0) {
            System.out.printf("5의배수입니다.");
        } else
            System.out.printf("3이나 5의 배수가 아닙니다.");

    }
}

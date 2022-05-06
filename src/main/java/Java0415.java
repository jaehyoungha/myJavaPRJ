import java.util.Scanner;

public class Java0415 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = a; j > i; j--) {
                System.out.printf("1");
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf("*");
            }
            System.out.println();

        }
    }
}
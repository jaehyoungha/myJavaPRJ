import java.util.Scanner;

public class Java0419_3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = a; j > i; j--) {
                System.out.printf(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class Java0412_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int i;
        for (i = 1; i <= a; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i+ " ");

        }

    }
}

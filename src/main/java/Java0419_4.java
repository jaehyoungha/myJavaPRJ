import java.util.Scanner;

public class Java0419_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && a == c) {
            System.out.printf("%d", 10000 + (a * 1000));
        } else if (a == b || a == c) {
            System.out.printf("%d", 1000 + a * 100);
        } else if (b ==c) {
            System.out.printf("%d", 1000 + b * 100);
        } else if (a > b && a > c) {
            System.out.printf("%d", a*100);
        } else if (b >a && b > c) {
            System.out.printf("%d", b*100);
        } else if (c > a && c > b) {
            System.out.printf("%d", c*100);
        }
    }
}

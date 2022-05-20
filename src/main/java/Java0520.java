import java.util.Scanner;

public class Java0520 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int gob=1;

        for (int i = 1; i <=a; i++) {
            gob *= i;

            if (i ==0) {
                System.out.println(1);
            }
        }
        System.out.println(gob);
    }
}

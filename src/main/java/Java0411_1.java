import java.util.Scanner;

public class Java0411_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int num = 0;

        int i;
        for (i = 1;  i <= a; i++) {
            num = num + i;
            if (num >= a) {
                break;
            }
        }
        System.out.println(i);
    }
}

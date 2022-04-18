import java.util.Scanner;

public class Java0418_star_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int star = sc.nextInt();

        for (int i = 1; i <= star; i++) {
            for (int j = star; j > i; j--) {
                System.out.printf(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
 }

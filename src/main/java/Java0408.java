import java.util.Scanner;

public class Java0408 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a =sc.nextInt();
        String b = "X";
        for (int i=1; i<=a; i++) {
            if ((i==3) || (i==6) || (i == 9)) {
                System.out.println(b+" ");
            } else {
                System.out.println(i+ " ");
            }
        }
    }
}

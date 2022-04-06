import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = 0;
      int i;
      for (i = 1; i <=a; i++) {
            System.out.println(i);
       } if (a % 2==0) {
            b = b + i;
        }
        System.out.println(b);
    }
}

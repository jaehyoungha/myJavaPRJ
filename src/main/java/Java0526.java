import java.util.Scanner;

public class Java0526 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        String reserve1 ="";
        String reserve2 ="";

        for (int i =a.length()-1; i >=0; i--) {
            reserve1 += a.charAt(i);
        }
        for (int i =b.length()-1; i >=0 ; i--) {
            reserve2 += b.charAt(i);
        }
        int a1 = Integer.parseInt(reserve1);
        int a2 = Integer.parseInt(reserve2);

        if (a1 > a2) {
            System.out.println(a1);
        }
        if (a1 < a2) {
            System.out.println(a2);
        }

    }
}

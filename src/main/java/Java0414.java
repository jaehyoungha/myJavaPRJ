import java.util.Scanner;

public class Java0414 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        if (a < 11 && b < 11) {
            for (int i = 1; i <=a ; i++) {
                for (int j = 1; j <=b; j++) {
                    System.out.printf("%d %d\n",i, j);
                 }
            }
        }else {
            System.out.println("10이하의 수로 입력해주세요");
        }
    }
}

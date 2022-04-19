import java.util.Scanner;

public class Java0419_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a%15==0){
            System.out.println("3과 5의 배수입니다.");
        } else if ( a % 3 ==0) {
            System.out.println("3의 배수입니다.");
        } else if ( a % 5==0) {
            System.out.println("5의 배수입니다.");
        } else {
            System.out.println("아무것도 아닙니다.");
        }
    }
}

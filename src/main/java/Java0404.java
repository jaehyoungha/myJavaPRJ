import java.util.Scanner;

public class Java0404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a<0){
            System.out.println("음수입니다.");
        } else {
            System.out.println("양수입니다.");
        }
        if (a%2==0) {
            System.out.println("짝수입니다.");
        } else{
            System.out.println("홀수입니다.");
        }
    }
}

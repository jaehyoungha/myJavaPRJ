import java.util.Scanner;

public class Ex05_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("1~4 중에 선택하세요 :");
        int a = sc.nextInt();



        switch (a) {
            case 1:
                System.out.println("1을 선택했다\n");
                break;
            case 2:
                System.out.println("2를 선택했다.");
                break;
            case 3:
                System.out.println("3을 선택했다\n");
                break;
            case 4:
                System.out.println("4을 선택했다\n");
              break;
            default:
                System.out.println("이상할걸 선택했다.");
        }
    }
}

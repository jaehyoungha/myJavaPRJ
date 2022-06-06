import java.util.Scanner;

public class Java0607 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = n;
        int cnt=0;
        while (true) {
            int ten = x / 10;
            int one = x % 10;
            x = (one*10) + ((ten + one) % 10);
            cnt++;
            if (n == x){
                break;
            }
        }
        System.out.println(cnt);
    }
}

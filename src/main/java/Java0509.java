import java.util.Scanner;

public class Java0509 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hap = 0;
        int n = sc.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <n; i++) {
            hap += arr[i];
            System.out.printf("%d ", hap);
        }
    }
}


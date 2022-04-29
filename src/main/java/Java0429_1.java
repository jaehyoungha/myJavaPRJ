import java.util.Scanner;

public class Java0429_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] aa = new int[23];

        for (int i = 0; i <n; i++) {
            aa[sc.nextInt()-1]++;
        }
        for (int i = 0; i <aa.length; i++) System.out.println(aa [i] + "");
    }
}

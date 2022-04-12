import java.util.Scanner;

public class Java0412 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int hap =0;

        for (int i=1; i<=a; i++) {
            hap= hap+i;
            if (hap >= a){
                break;
            }
        }
        System.out.println(hap);
    }
}

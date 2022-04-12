import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int hap =0;
        int i;
        for ( i=1; i <= 9; i++) {

            hap=  a* i;

            System.out.printf("%d*%d=%d\n", a, i, hap);
        }
    }
}

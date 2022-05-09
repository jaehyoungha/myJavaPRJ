import java.util.Scanner;

public class Java0509_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int [n];

        int [] stu = new int[23];

        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
            int cnt = arr[i];
            stu[cnt-1]++;
        }
        for (int i = 0; i <stu.length ; i++) {
            System.out.print(stu[i]);
            if ( i < stu.length-1) System.out.printf(" ");
        }
    }
}

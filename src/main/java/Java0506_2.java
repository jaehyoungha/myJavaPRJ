import java.util.Scanner;

public class Java0506_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int [] arr = new int[k];

        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i <2; i++) {
            for (int j = 0; j <arr.length; j++) {
                System.out.println(arr[j]);
            }
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Java0620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr [] = new int[7];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(arr[6]);
        System.out.println(arr[5]);
    }
}

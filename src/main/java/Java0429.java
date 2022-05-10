import java.util.Scanner;

public class Java0429 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];

        for (Integer i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        for (Integer i = 0; i <n; i+=2) {
            if (arr[i] > arr[i+1]){
                System.out.println(arr[i]);
            } else if (arr[i] < arr[i+1]){
                System.out.println(arr[i+1]);
            }
        }
    }
}

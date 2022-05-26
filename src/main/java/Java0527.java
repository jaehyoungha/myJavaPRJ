import java.util.Scanner;

public class Java0527 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        int [] arr;

        for (int i = 0; i <c; i++) {
            int n = sc.nextInt();
            arr = new int[n];
            double hap = 0;
            for (int j = 0; j <n; j++) {
                int score = sc.nextInt();
                arr[j] = score;
                hap += arr[j];
            }
            double avg = (hap/n);
            double cnt =0;

            for (int j = 0; j <n; j++) {
                if (arr[j] > avg){
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n",(cnt/n)*100);
        }
            sc.close();
    }
}
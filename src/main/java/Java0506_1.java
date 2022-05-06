import java.util.Scanner;

public class Java0506_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        String [] arr = a.split("");

         int cnt1=0;
         int cnt2=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==("(")) {
                cnt1++;
            } else if (arr[i] ==(")")) {
                cnt2++;
            }
        }
        System.out.printf("%d %d",cnt1,cnt2);

    }
}

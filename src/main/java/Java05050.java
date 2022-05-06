import java.util.Scanner;

public class Java05050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s",arr[i]);
        }

    }
}

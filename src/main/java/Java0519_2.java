import java.util.Scanner;

public class Java0519_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine().trim();
        String [] arr = a.split(" ");

        System.out.println(arr.length);
    }
}

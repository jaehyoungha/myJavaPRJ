import java.util.Scanner;

public class Java0519 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        String [] arr =n.split("");

        for (int i = 0; i <arr.length; i++) {
            System.out.println("'" + arr[i]+"'");
        }
    }
}

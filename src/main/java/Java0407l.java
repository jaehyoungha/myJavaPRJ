import java.util.Scanner;

public class Java0407l {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int test = a.charAt(0);

        for (int i = 97; i <= test; i++) {
            //System.out.println((char)i);
            System.out.printf("%c \n", i);
        }
    }
}
